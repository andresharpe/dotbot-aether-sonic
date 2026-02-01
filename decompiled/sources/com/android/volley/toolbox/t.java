package com.android.volley.toolbox;

import androidx.annotation.P;
import com.android.volley.ParseError;
import com.android.volley.p;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t extends u<JSONObject> {
    public t(String str, p.b<JSONObject> bVar, @P p.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.u, com.android.volley.Request
    public com.android.volley.p<JSONObject> N(com.android.volley.l lVar) {
        try {
            return com.android.volley.p.c(new JSONObject(new String(lVar.f24494b, m.g(lVar.f24495c, "utf-8"))), m.e(lVar));
        } catch (UnsupportedEncodingException e4) {
            return com.android.volley.p.a(new ParseError(e4));
        } catch (JSONException e5) {
            return com.android.volley.p.a(new ParseError(e5));
        }
    }

    @Deprecated
    public t(String str, @P JSONObject jSONObject, p.b<JSONObject> bVar, @P p.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    public t(int i4, String str, @P JSONObject jSONObject, p.b<JSONObject> bVar, @P p.a aVar) {
        super(i4, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
