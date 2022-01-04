package com.revature.banksy.controllers;




@Validated
@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @PostMapping
    public String save(@Valid @RequestBody AccountsVO vO) {
        return accountsService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") Integer id) {
        accountsService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") Integer id,
                       @Valid @RequestBody AccountsUpdateVO vO) {
        accountsService.update(id, vO);
    }

    @GetMapping("/{id}")
    public AccountsDTO getById(@Valid @NotNull @PathVariable("id") Integer id) {
        return accountsService.getById(id);
    }

    @GetMapping
    public Page<AccountsDTO> query(@Valid AccountsQueryVO vO) {
        return accountsService.query(vO);
    }
}
