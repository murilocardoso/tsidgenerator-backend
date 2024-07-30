package io.tsidgenerator.tsidgenerator.adapter.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tsidgenerator.tsidgenerator.ConvertTsidFromLongToStringUseCase;
import io.tsidgenerator.tsidgenerator.ConvertTsidFromStringToLongUseCase;
import io.tsidgenerator.tsidgenerator.GenerateTsidUseCase;


@RestController
@RequestMapping("/api/tsid")
public final class RestAPI {
    private final GenerateTsidUseCase generateTsidUseCase;
    private final ConvertTsidFromStringToLongUseCase convertTsidFromStringToLongUseCase;
    private final ConvertTsidFromLongToStringUseCase convertTsidFromLongToStringUseCase;

    public RestAPI(GenerateTsidUseCase generateTsidUseCase,
            ConvertTsidFromStringToLongUseCase convertTsidStringToLongUseCase,
            ConvertTsidFromLongToStringUseCase convertTsidLongToStringUseCase) {
        this.generateTsidUseCase = generateTsidUseCase;
        this.convertTsidFromStringToLongUseCase = convertTsidStringToLongUseCase;
        this.convertTsidFromLongToStringUseCase = convertTsidLongToStringUseCase;
    }

    @GetMapping("/new")
    public GenerateTsIdResponse getNewTsid() {
        var result = generateTsidUseCase.execute();
        return GenerateTsIdResponse.from(result);
    }

    @GetMapping("/{tsid}/as-long")
    public ConvertTsIdFromStringToLongResponse convertStringToLong(@PathVariable final String tsid) {
        var result = convertTsidFromStringToLongUseCase.execute(tsid);
        return ConvertTsIdFromStringToLongResponse.from(result);
    }

    @GetMapping("/{tsid}/as-string")
    public ConvertTsIdFromLongToStringResponse convertLongToString(@PathVariable final Long tsid) {
        var result = convertTsidFromLongToStringUseCase.execute(tsid);
        return ConvertTsIdFromLongToStringResponse.from(result);
    }
}
