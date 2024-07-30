package io.tsidgenerator.tsidgenerator.adapter.in;

import com.github.f4b6a3.tsid.Tsid;

public final class GenerateTsIdResponse {
    private final String valueAsString;
    private final Long valueAsLong;

    private GenerateTsIdResponse() {
        this.valueAsString = null;
        this.valueAsLong = null;
    }

    private GenerateTsIdResponse(final String valueAsString, final Long valueAsLong) {
        this.valueAsString = valueAsString;
        this.valueAsLong = valueAsLong;
    }

    public static GenerateTsIdResponse from(final Tsid tsid) {
        return new GenerateTsIdResponse(tsid.toString(), tsid.toLong());
    }
    
    public String getValueAsString() {
        return valueAsString;
    }

    public Long getValueAsLong() {
        return valueAsLong;
    }
}
