package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
  @GetMapping(value = {"/", "/index", "index.html"})
  public String index() {
    return "index";
  }

  @GetMapping("contact")
  public String contact(Model model) {
    model.addAttribute("contacted", false);
    return "contact";
  }

  @PostMapping("contact")
  public String postContact(Model model, @RequestParam Map<String, String> params) {
    //TODO if done, set the contacted with true
    model.addAttribute("contacted", true);
    return "contact";
  }

  @GetMapping("about-us")
  public String aboutUs() {
    return "about-us";
  }

  @GetMapping("scraping-api-avoid-captchas-blocks")
  public String scrapingAPI() {
    return "products/scraping-api-avoid-captchas-blocks";
  }

  @GetMapping("anonymous-crawler-asynchronous-scraping")
  public String anonymousCrawler() {
    return "products/anonymous-crawler-asynchronous-scraping";
  }

  @GetMapping("scraping-with-worldwide-backconnect-proxy")
  public String scrapingProxy() {
    return "products/scraping-with-worldwide-backconnect-proxy";
  }

  @GetMapping("login")
  public String login(Model model) {
    model.addAttribute("error","");
    return "login";
  }

  @PostMapping("login")
  public String postLogin(Model model, @RequestParam Map<String, String> params) {
    //TODO if done, redirect
    // if hasError
    model.addAttribute("warning", "invalid");
    return "login";
  }

  @GetMapping("signup")
  public String signup(Model model, String coupon) {
    // TODO if has coupon check coupon
    model.addAttribute("coupon", false);
    model.addAttribute("warning", "invalid");
    return "signup";
  }

  @PostMapping("signup")
  public String postSignup(Model model, @RequestParam Map<String, String> params) {
    // TODO if signup success
    model.addAttribute("signup", "success");
    return "signup";
  }

  @GetMapping("/terms")
  public String terms() {
    return "terms";
  }

  @GetMapping("/privacy")
  public String privacy() {
    return "privacy";
  }

  @GetMapping("/how-to-scrape-{brand}")
  public String scrape(@PathVariable("brand") String brand) {
    return "scrape/" + brand;
  }
}
