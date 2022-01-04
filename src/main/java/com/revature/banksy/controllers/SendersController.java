package com.revature.banksy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/senders")
public class SendersController {

    @Autowired
    private SendersService sendersService;

    @PostMapping
    public String save(@Valid @RequestBody SendersVO vO) {
        return sendersService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") Integer id) {
        sendersService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") Integer id,
                       @Valid @RequestBody SendersUpdateVO vO) {
        sendersService.update(id, vO);
    }

    @GetMapping("/{id}")
    public SendersDTO getById(@Valid @NotNull @PathVariable("id") Integer id) {
        return sendersService.getById(id);
    }

    @GetMapping
    public Page<SendersDTO> query(@Valid SendersQueryVO vO) {
        return sendersService.query(vO);
    }
}
