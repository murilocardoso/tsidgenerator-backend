package io.tsidgenerator.tsidgenerator.application;

import com.github.f4b6a3.tsid.Tsid;
import com.github.f4b6a3.tsid.TsidCreator;

import io.tsidgenerator.tsidgenerator.GenerateTsidUseCase;

import org.springframework.stereotype.Service;

@Service
public final class GenerateTsidService implements GenerateTsidUseCase {
    public Tsid execute() {
        return TsidCreator.getTsid();
    }
}
