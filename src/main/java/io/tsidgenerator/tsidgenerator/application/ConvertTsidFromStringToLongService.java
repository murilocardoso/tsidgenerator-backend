package io.tsidgenerator.tsidgenerator.application;

import com.github.f4b6a3.tsid.Tsid;

import io.tsidgenerator.tsidgenerator.ConvertTsidFromStringToLongUseCase;

import org.springframework.stereotype.Service;

@Service
public final class ConvertTsidFromStringToLongService implements ConvertTsidFromStringToLongUseCase  {
    public Long execute(final String tsid) {
        Tsid tsidObj = Tsid.from(tsid);
        return tsidObj.toLong();
    }
}
