package tugas.individu.sidok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tugas.individu.sidok.model.SpesialisasiModel;
import tugas.individu.sidok.service.SpesialisasiService;

@Controller
public class SpesialisasiController{
    @Qualifier("spesialisasiServiceImpl")

    @Autowired
    SpesialisasiService spesialisasiService;

    @GetMapping("/spesialisasi/add")
    public String formAddSpesialisasi(Model model){
        SpesialisasiModel spesialisasi = new SpesialisasiModel();
        model.addAttribute("spesialisasi", spesialisasi);
        return "form-add-spesialisasi";
    }

    @PostMapping("/spesialisasi/add")
    public String submitAddSpesialisasi(@ModelAttribute SpesialisasiModel spesialisasi, Model model){
        spesialisasiService.addSpesialisasi(spesialisasi);
        Boolean msg = true;
        model.addAttribute("msg", msg);
        return "form-add-spesialisasi";
    }
}