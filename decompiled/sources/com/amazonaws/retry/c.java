package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class c {
    public static boolean a(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        String b4 = amazonServiceException.b();
        if (!"RequestTimeTooSkewed".equals(b4) && !"RequestExpired".equals(b4) && !"InvalidSignatureException".equals(b4) && !"SignatureDoesNotMatch".equals(b4)) {
            return false;
        }
        return true;
    }

    public static boolean b(Throwable th) {
        if (th instanceof AbortedException) {
            return true;
        }
        if (th.getCause() != null) {
            Throwable cause = th.getCause();
            if ((cause instanceof InterruptedException) || ((cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean c(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        return "Request entity too large".equals(amazonServiceException.b());
    }

    public static boolean d(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        String b4 = amazonServiceException.b();
        if (!"Throttling".equals(b4) && !"ThrottlingException".equals(b4) && !"ProvisionedThroughputExceededException".equals(b4)) {
            return false;
        }
        return true;
    }
}
