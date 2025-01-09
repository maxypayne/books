package com.mlucov.mappers;

import com.mlucov.business.save.SaveBookInput;
import com.mlucov.models.request.SaveBookRequest;
import org.springframework.stereotype.Component;

@Component
public class SaveBookMapper {
    public SaveBookInput toSaveBookInput(SaveBookRequest request) {
        return new SaveBookInput(request.name(), request.isbn());
    }
}
