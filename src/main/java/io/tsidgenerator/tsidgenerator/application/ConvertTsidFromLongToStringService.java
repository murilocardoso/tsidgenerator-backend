package io.tsidgenerator.tsidgenerator.application;

import com.github.f4b6a3.tsid.Tsid;

import io.tsidgenerator.tsidgenerator.ConvertTsidFromLongToStringUseCase;

import org.springframework.stereotype.Service;

@Service
public final class ConvertTsidFromLongToStringService implements ConvertTsidFromLongToStringUseCase {
    public String execute(final Long tsid) {
        Tsid tsidObj = Tsid.from(tsid);
        return tsidObj.toString();
    }
}
