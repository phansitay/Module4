package codegym.vn.controller;

import codegym.vn.bean.Product;
import codegym.vn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = {"/product/list", "/"}, method = RequestMethod.GET)
    public String displayList(Model model) {
        model.addAttribute("products", productService.findAll());
        return "list";
    }
    @GetMapping("create")
    public String showCreate(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("create")
    public String Create(@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "redirect:/product/list";
    }
    @GetMapping("/update")
    public  String showUpdate(Model model , @RequestParam("id") String id)
    {
        model.addAttribute("product",productService.findById(id));
        return "update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
        productService.createOrUpdate(product);
        return "redirect:/product/list";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable String id, Model model) {
        model.addAttribute("customer", productService.findById(id));
        productService.deleteById(id);
        return "redirect:/product/list";
    }
    @GetMapping("/{id}/detail")
    public String detail(@PathVariable String id, Model model) {
        Product product = new Product();
        product = productService.findById(id);
        model.addAttribute("product", product);
        return "detail";
    }
    @PostMapping("/search")
    public String search(@RequestParam("search") String search,Model model)
    {
        model.addAttribute("product",productService.searchProduct(search));
        return "/list";
    }
}
