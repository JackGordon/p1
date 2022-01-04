package com.revature.banksy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/recipients")
public class RecipientsController {

    @Autowired
    private RecipientsService recipientsService;

    @PostMapping
    public String save(@Valid @RequestBody RecipientsVO vO) {
        return recipientsService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") Integer id) {
        recipientsService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") Integer id,
                       @Valid @RequestBody RecipientsUpdateVO vO) {
        recipientsService.update(id, vO);
    }

    @GetMapping("/{id}")
    public RecipientsDTO getById(@Valid @NotNull @PathVariable("id") Integer id) {
        return recipientsService.getById(id);
    }

    @GetMapping
    public Page<RecipientsDTO> query(@Valid RecipientsQueryVO vO) {
        return recipientsService.query(vO);
    }
}
