package com.example.teacher.controller;

import com.example.teacher.entity.Fenn;
import com.example.teacher.entity.TF;
import com.example.teacher.entity.Teacher;
import com.example.teacher.repository.FennRepo;
import com.example.teacher.repository.TFRepo;
import com.example.teacher.service.TeacherService;
import com.example.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class TeacherController {
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    FennRepo fennRepo;
    @Autowired
    TFRepo tfRepo;


    @RequestMapping("/")
    public  String showPage(){
        return  "home";
    }
    @RequestMapping("/index")
    public  String showUser(){
        return  "index";
    }


    @RequestMapping("/saveData")
    @ResponseBody
    public String saveData( Teacher teacher) {
    teacherRepository.save(teacher);
    return "goster";
    }
    @RequestMapping("/saveDataF")
    @ResponseBody
    public String saveDataF(Fenn fenn) {
        fennRepo.save(fenn);
        return "goster";
    }

    //TF join entity
    @RequestMapping("/saveDataTF")
    @ResponseBody
    public String saveDataTF(@RequestParam("tfid")int tfid, @RequestParam("id")int id, @RequestParam("fid")int fid) {
       TF tf1=new TF(tfid, id, fid);
        tf1.setId(id);
        tf1.setFid(fid);
        tfRepo.save(tf1);
        return "goster";

    }


    @RequestMapping("/showData")
    public ModelAndView showData(){
        ModelAndView mv=new ModelAndView();
        List<Teacher> datalist=teacherRepository.findAll();
        mv.addObject("data",datalist);
        mv.setViewName("goster");
        return mv;
    }
    //Fenn
    @RequestMapping("/showDataF")
    public ModelAndView showDataF(){
        ModelAndView mv=new ModelAndView();
        List<Fenn> fl=fennRepo.findAll();
        mv.addObject("dataf",fl);
        mv.setViewName("fennsiyahi");
        return mv;
    }


    @RequestMapping("/deleteData")
    public ModelAndView deleteData(@RequestParam("id")int id){
        teacherRepository.deleteById(id);
        ModelAndView mv=new ModelAndView();
        List<Teacher> datalist=teacherRepository.findAll();
        mv.addObject("data",datalist);
        mv.setViewName("goster");
        return mv;
    }
    @RequestMapping("/updateData")
    @ResponseBody
    public String updateData(Teacher teacher, @RequestParam("id")int id){
        teacherRepository.findById(id);
        teacher.setAd(teacher.getAd());
        teacher.setSoyad(teacher.getSoyad());
        teacherRepository.save(teacher);
        return "goster";
    }
    @GetMapping("/ad")
    public String getTelebeByAd(Model model, @RequestParam String ad){
    //public String getTelebeByAd(Model model, @PathVariable String ad){
    List <Teacher>  teacher=teacherRepository.findByAd(ad);
    model.addAttribute("data", teacher);
    return "goster";
    }
}
