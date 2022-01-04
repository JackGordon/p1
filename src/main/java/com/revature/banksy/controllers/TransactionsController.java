package com.revature.banksy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;

    @PostMapping
    public String save(@Valid @RequestBody TransactionsVO vO) {
        return transactionsService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") Integer id) {
        transactionsService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") Integer id,
                       @Valid @RequestBody TransactionsUpdateVO vO) {
        transactionsService.update(id, vO);
    }

    @GetMapping("/{id}")
    public TransactionsDTO getById(@Valid @NotNull @PathVariable("id") Integer id) {
        return transactionsService.getById(id);
    }

    @GetMapping
    public Page<TransactionsDTO> query(@Valid TransactionsQueryVO vO) {
        return transactionsService.query(vO);
    }
}
