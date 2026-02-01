package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    @W(28)
    /* renamed from: androidx.core.telephony.mbms.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0099a {
        private C0099a() {
        }

        static CharSequence a(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                strArr[i4] = it.next().toLanguageTag();
                i4++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    private a() {
    }

    @P
    public static CharSequence a(@N Context context, @N ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0099a.a(context, serviceInfo);
        }
        return null;
    }
}
