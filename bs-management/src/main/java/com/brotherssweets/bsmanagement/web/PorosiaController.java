package com.brotherssweets.bsmanagement.web;

import com.brotherssweets.bsmanagement.domain.Porosia;
import com.brotherssweets.bsmanagement.services.MapValidationErrorService;
import com.brotherssweets.bsmanagement.services.PorosiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/porosia")
public class PorosiaController {

    @Autowired
    private PorosiaService porosiaService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewPorosia(@Valid @RequestBody Porosia porosia, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        Porosia porosia1 = porosiaService.saveOrUpdatePorosia(porosia);
        return new ResponseEntity<Porosia>(porosia1, HttpStatus.CREATED);
    }

    @GetMapping("/{porosiaId}")
    public ResponseEntity<?> getPorosiaById(@PathVariable String porosiaId){

        Porosia porosia = porosiaService.findPorosiaByIdentifier(porosiaId);

        return new ResponseEntity<Porosia>(porosia,HttpStatus.OK);
    }
}
