package main.java.com.example.news_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private String activePage = "";

    @GetMapping({ "", "/" })
    public String home(Model model) {
        model.addAttribute("activePage", activePage);
        return "login/index";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        activePage = "dashboard";
        model.addAttribute("activePage", activePage);
        return "dashboard/dashboard";
    }

    @GetMapping("/admin_infomation")
    public String adminInformation(Model model) {
        activePage = "admin_infomation";
        model.addAttribute("activePage", activePage);
        return "admin_infomation/index";
    }

    @GetMapping("/comment_management")
    public String commentManagement(Model model) {
        activePage = "comment_management";
        model.addAttribute("activePage", activePage);
        return "comment_management/index";
    }

    @GetMapping("/account_management")
    public String accountManagement(Model model) {
        activePage = "account_management";
        model.addAttribute("activePage", activePage);
        return "account_management/index";
    }

    @GetMapping("/account_management/add_account")
    public String addAccount(Model model) {
        activePage = "account_management";
        model.addAttribute("activePage", activePage);
        return "account_management/add_account";
    }

    @GetMapping("/account_management/edit_account")
    public String editAccount(Model model) {
        activePage = "account_management";
        model.addAttribute("activePage", activePage);
        return "account_management/edit_account";
    }

    @GetMapping("/articles_management")
    public String articlesManagement(Model model) {
        activePage = "articles_management";
        model.addAttribute("activePage", activePage);
        return "articles_management/index";
    }

    @GetMapping("/articles_management/detail_news")
    public String detailArticles(Model model) {
        activePage = "articles_management";
        model.addAttribute("activePage", activePage);
        return "articles_management/detail_news";
    }

    @GetMapping("/articles_management/add_news")
    public String addArticles(Model model) {
        activePage = "articles_management";
        model.addAttribute("activePage", activePage);
        return "articles_management/add_news";
    }

    @GetMapping("/articles_management/edit_news")
    public String editArticles(Model model) {
        activePage = "articles_management";
        model.addAttribute("activePage", activePage);
        return "articles_management/edit_news";
    }

    @GetMapping("/category_management")
public String categoryManagement(Model model) {
        activePage = "category_management";
        model.addAttribute("activePage", activePage);
        return "category_management/index";
    }

    @GetMapping("/category_management/add_category")
    public String addCategory(Model model) {
        activePage = "category_management";
        model.addAttribute("activePage", activePage);
        return "category_management/add_category";
    }

    @GetMapping("/category_management/edit_category")
    public String editCategory(Model model) {
        activePage = "category_management";
        model.addAttribute("activePage", activePage);
        return "category_management/edit_category";
    }
}