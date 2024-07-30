package io.tsidgenerator.tsidgenerator.adapter.in;


public final class ConvertTsIdFromStringToLongResponse {
    private final String value;

    private ConvertTsIdFromStringToLongResponse() {
        this.value = null;
    }

    private ConvertTsIdFromStringToLongResponse(final Long value) {
        this.value = value.toString();
    }

    public static ConvertTsIdFromStringToLongResponse from(final Long value) {
        return new ConvertTsIdFromStringToLongResponse(value);
    }

    public String getValue() {
        return value;
    }
}
