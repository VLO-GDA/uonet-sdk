package net.maciekmm.uonet;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Base64;

public class EncryptionUtils {
    private static final String ALGORITHM_NAME = "SHA1withRSA";
    private static final String CERT_TYPE = "pkcs12";
    private static final String CONTAINER_NAME = "LoginCert";
    private static final String PASSWORD = "CE75EA598C7743AD9B0B7328DED85B06";

    public static String signContent(byte[] contents, final InputStream cert) throws IOException, GeneralSecurityException, NullPointerException {
        final KeyStore instance = KeyStore.getInstance(CERT_TYPE);
        instance.load(cert, PASSWORD.toCharArray());
        final PrivateKey privateKey = (PrivateKey) instance.getKey(CONTAINER_NAME, PASSWORD.toCharArray());
        final Signature instance2 = Signature.getInstance(ALGORITHM_NAME);
        instance2.initSign(privateKey);
        instance2.update(contents);
        return Base64.getEncoder().encodeToString(instance2.sign());
    }
}
