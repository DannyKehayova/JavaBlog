package softuniBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import softuniBlog.entity.Tag;
import softuniBlog.repository.TagRepository;

/**
 * Created by Danny on 30.11.2016 г..
 */
@Controller
public class TagController {
    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/tag/{name}")
    public String articlesWithTag(Model model, @PathVariable String name){
        Tag tag=this.tagRepository.findByName(name);
        if(tag==null){
            return "redirect:/";
        }
        model.addAttribute("view","tag/articles");
        model.addAttribute("tag",tag);
        return "base-layout";
    }
}
