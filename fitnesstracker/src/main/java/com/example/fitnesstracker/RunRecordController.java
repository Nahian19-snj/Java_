package com.example.fitnesstracker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Controller for handling web requests related to running records.
 * This class handles displaying all runs, adding new runs,
 * and deleting existing runs.
 */
@Controller
public class RunRecordController {

    /**
     * Repository used to access RunRecord data from the database.
     */
    @Autowired
    private RunRecordRepository runRecordRepository;

    /**
     * Displays the home page with all running records.
     * Also calculates and displays the total mileage.
     *
     * @param model
     * @return
     */
    @GetMapping("/")
    public String home(Model model) {
        List<RunRecord> records = runRecordRepository.findAll();
        model.addAttribute("records", records);

        // Calculate total mileage
        double totalMileage = records.stream().mapToDouble(RunRecord::getMiles).sum();
        model.addAttribute("totalMileage", totalMileage);

        return "index";
    }

    /**
     * Adds a new running record based on user input.
     *
     * @param route
     * @param miles
     * @param date
     * @param model
     * @return
     */
    @PostMapping("/add")
    public String addRun(@RequestParam String route,
                         @RequestParam double miles,
                         @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
                         Model model) {

        RunRecord run = new RunRecord(route, miles, date);
        runRecordRepository.save(run);

        model.addAttribute("records", runRecordRepository.findAll());
        double totalMileage = runRecordRepository.findAll().stream().mapToDouble(RunRecord::getMiles).sum();
        model.addAttribute("totalMileage", totalMileage);

        model.addAttribute("message", route);

        return "index";
    }

    /**
     * Deletes a running record by its ID.
     *
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public String deleteRun(@PathVariable Long id) {
        runRecordRepository.deleteById(id);
        return "redirect:/";
    }
}
