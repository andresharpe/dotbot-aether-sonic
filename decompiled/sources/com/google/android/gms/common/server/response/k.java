package com.google.android.gms.common.server.response;

import androidx.annotation.P;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes.dex */
final class k implements l<BigDecimal> {
    @Override // com.google.android.gms.common.server.response.l
    @P
    public final /* synthetic */ BigDecimal a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        BigDecimal u3;
        u3 = fastParser.u(bufferedReader);
        return u3;
    }
}
