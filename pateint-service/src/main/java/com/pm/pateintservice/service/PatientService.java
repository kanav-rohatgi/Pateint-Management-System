package com.pm.pateintservice.service;

import com.pm.pateintservice.dto.PatientResponseDTO;
import com.pm.pateintservice.mapper.PatientMapper;
import com.pm.pateintservice.model.Patient;
import com.pm.pateintservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream().map(PatientMapper::toDTO).toList();

    }
}
