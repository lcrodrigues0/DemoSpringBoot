package com.example.demo.service;

import com.example.demo.model.Photo;
import com.example.demo.repository.DemoRepository;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private final DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public Iterable<Photo> get() {
        return demoRepository.findAll();
    }

    public Photo get(Integer id) {
        return demoRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        demoRepository.deleteById(id);
    }

    public Photo save(String name, byte[] data, String contentType) {
        Photo photo = new Photo();

        photo.setFileName(name);
        photo.setData(data);
        photo.setContentType(contentType);

        demoRepository.save(photo);

        return photo;
    }
}
