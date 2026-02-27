package deusvainerjuli.qrcode.generator_.ports;

public interface StoragePort {
    String uploadfile(byte[] fileData, String fileName, String contentType);
}
