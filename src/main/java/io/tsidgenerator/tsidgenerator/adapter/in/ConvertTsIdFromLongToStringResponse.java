package io.tsidgenerator.tsidgenerator.adapter.in;

public final class ConvertTsIdFromLongToStringResponse {
    private final String value;

    private ConvertTsIdFromLongToStringResponse() {
        this.value = null;
    }

    private ConvertTsIdFromLongToStringResponse(final String value) {
        this.value = value;
    }

    public static ConvertTsIdFromLongToStringResponse from(final String value) {
        return new ConvertTsIdFromLongToStringResponse(value);
    }

    public String getValue() {
        return value;
    }
}
