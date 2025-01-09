package com.mlucov.controllers;

import com.mlucov.business.save.ISaveBookGatewayApi;
import com.mlucov.business.save.SaveBookInput;
import com.mlucov.mappers.SaveBookMapper;
import com.mlucov.models.request.SaveBookRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class SaveBookController {
    private final ISaveBookGatewayApi iSaveBookGatewayApi;
    private final SaveBookMapper saveBookMapper;

    public SaveBookController(
        ISaveBookGatewayApi iSaveBookGatewayApi,
        SaveBookMapper saveBookMapper
    ) {
        this.iSaveBookGatewayApi = iSaveBookGatewayApi;
        this.saveBookMapper = saveBookMapper;
    }

    @PostMapping("/save")
    public Integer saveBook(@RequestBody SaveBookRequest request) {
        SaveBookInput input = this.saveBookMapper.toSaveBookInput(request);
        return this.iSaveBookGatewayApi.saveBook(input);
    }
}
