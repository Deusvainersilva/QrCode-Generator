package deusvainerjuli.qrcode.generator_.controller;

import deusvainerjuli.qrcode.generator_.dto.qrcode.DtoQrCodeGenerateRequest;
import deusvainerjuli.qrcode.generator_.dto.qrcode.DtoQrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {


    @PostMapping
    public ResponseEntity<DtoQrCodeGenerateResponse> codeGenerate(@RequestBody DtoQrCodeGenerateRequest request){
    return null;
    }
}
