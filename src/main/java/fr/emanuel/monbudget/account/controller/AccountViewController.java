package fr.emanuel.monbudget.account.controller;

import fr.emanuel.monbudget.account.model.Account;
import fr.emanuel.monbudget.account.service.AccountService;
import fr.emanuel.monbudget.accounttype.service.AccountTypeService;
import fr.emanuel.monbudget.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountViewController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserService userService;

    @Autowired
    private AccountTypeService accountTypeService;

    @GetMapping("/accounts/list/{id}")
    public String getUserAccount(Model model, @PathVariable long id){
        model.addAttribute("title", "Accounts list");
        model.addAttribute("accounts", this.accountService.findByUser(id));
        return "accounts/list";
    }

    @PostMapping("/accounts/add")
    public String addUserAccount(Model model, @ModelAttribute("newAccount") Account newAccount){
        newAccount.setUser(this.userService.findById(1L));
        this.accountService.create(newAccount);
        return "redirect:/accounts/list/1";
    }

    @GetMapping("/accounts/accountForm")
    public String showAccountForm(Model model){
        Account account = new Account();
        model.addAttribute("account", account);
        model.addAttribute("types", this.accountTypeService.findAll());
        return "accounts/form";
    }
}
