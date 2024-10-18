package fr.emanuel.monbudget.account.controller;

import fr.emanuel.monbudget.account.model.Account;
import fr.emanuel.monbudget.account.service.AccountService;
import fr.emanuel.monbudget.accounttype.service.AccountTypeService;
import fr.emanuel.monbudget.user.model.User;
import fr.emanuel.monbudget.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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

    @GetMapping("/accounts/list")
    public String getUserAccount(Model model, Authentication authentication){
        User connectedUser = this.userService.findByUsername(authentication.getName());
        model.addAttribute("title", "Accounts list");
        model.addAttribute("accounts", this.accountService.findByUser(connectedUser.getId()));
        return "accounts/list";
    }

    @PostMapping("/accounts/add")
    public String addUserAccount(@ModelAttribute("newAccount") Account newAccount, Authentication authentication){
        newAccount.setUser(this.userService.findByUsername(authentication.getName()));
        this.accountService.create(newAccount);
        return "redirect:/accounts/list";
    }

    @GetMapping("/accounts/accountForm")
    public String showAccountForm(Model model){
        Account account = new Account();
        model.addAttribute("account", account);
        model.addAttribute("types", this.accountTypeService.findAll());
        return "accounts/form";
    }

    @GetMapping("/account/{id}")
    public String showAccount(@PathVariable Long id, Model model){
        Account account = this.accountService.findById(id);
        model.addAttribute("account", account);
        return "accounts/detail";
    }

    @GetMapping("/account/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        Account account = this.accountService.findById(id);
        this.accountService.remove(account);
        model.addAttribute("account", account);
        return "redirect:/accounts/list";
    }
}
