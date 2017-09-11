package com.xspos.xspos.Controller;

import com.xspos.xspos.Model.Category;
import com.xspos.xspos.Model.CategoryDTO;
import com.xspos.xspos.Model.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/getCategory")
    public @ResponseBody Iterable<Category> getCategory() {
//        Category n = new Category();
//        n.setCode("test");
//        n.setDescription("des");
//        categoryRepository.save(n);

        Iterable<Category> categoryList = categoryRepository.findAll();

        return categoryList;
    }
}
