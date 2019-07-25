package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.entity.Package;
import com.oocl.packagebooking.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/package")
public class PackageController {
    @Autowired
    PackageService packageService;

    @PostMapping
    public Package addPackage(@RequestBody Package pack){
        //System.out.println(pack.getRegisterTime());
        return packageService.addPackage(pack);
    }

    @GetMapping
    public List<Package> getAllPackage(){
        return packageService.getAllPackage();
    }

    @PutMapping
    public Package modifyPackage(@RequestBody long id){
        System.out.println(id);
       return  packageService.modifyPackage(id);

    }

    @GetMapping("/11")
    public List<Package> getHavingPack(){
      return  packageService.getHavingPack();
    }


}
