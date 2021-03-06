package capm.enums;

/**
 * @author deepak.jayaprakash
 */
public enum ReturnCode {
    EC_001("EC_001", "api failed"),
    EC_002("EC_002", "no team with given id"),
    EC_003("EC_003", "no manager with given id"),
    EC_004("EC_004", "already upper limit reached"),
    SC_001("SC_001", "Success");

    private final String code;
    private final String message;

    private ReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
