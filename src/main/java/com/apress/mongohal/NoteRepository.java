package com.apress.mongohal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface NoteRepository extends CrudRepository<Note, String> {

}
