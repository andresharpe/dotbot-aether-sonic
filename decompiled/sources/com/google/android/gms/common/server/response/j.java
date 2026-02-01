package com.google.android.gms.common.server.response;

import androidx.annotation.P;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes.dex */
final class j implements l<BigInteger> {
    @Override // com.google.android.gms.common.server.response.l
    @P
    public final /* synthetic */ BigInteger a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        BigInteger v3;
        v3 = fastParser.v(bufferedReader);
        return v3;
    }
}
