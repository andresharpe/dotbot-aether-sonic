package com.harman.jbl.partybox.utils;

import android.content.res.Resources;
import androidx.core.os.C0743f;
import com.harman.legallib.LegalConfig;
import java.util.Locale;
import kotlin.jvm.internal.F;
import kotlin.text.A;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final m f46192a = new m();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final String f46193b = "zh_cn";

    private m() {
    }

    @l3.d
    public final String a(@l3.d Resources resources) {
        String str;
        boolean K12;
        boolean K13;
        boolean T22;
        F.p(resources, "resources");
        Locale d4 = C0743f.a(resources.getConfiguration()).d(0);
        if (d4 != null) {
            str = d4.getLanguage();
        } else {
            str = null;
        }
        if (str == null) {
            str = "en";
        }
        K12 = z.K1(str, "zh", true);
        if (!K12) {
            K13 = z.K1(str, "pt", true);
            if (K13) {
                return "pt_br";
            }
            return str;
        }
        String d5 = com.harman.jbl.partybox.persistence.a.f42065a.d(resources.getConfiguration().locale.getLanguage());
        if (d5 != null) {
            T22 = A.T2(d5, "zh-rTW", false, 2, null);
            if (T22) {
                return "zh_tw";
            }
        }
        return f46193b;
    }

    @l3.d
    public final LegalConfig.Language b(@l3.d Resources resources) {
        F.p(resources, "resources");
        if (F.g(a(resources), f46193b)) {
            return LegalConfig.Language.CN;
        }
        return LegalConfig.Language.EN;
    }

    @l3.d
    public final LegalConfig.Language c(@l3.d Resources resources) {
        String str;
        boolean T22;
        boolean T23;
        boolean T24;
        F.p(resources, "resources");
        LegalConfig.Language language = LegalConfig.Language.EN;
        Locale d4 = C0743f.a(resources.getConfiguration()).d(0);
        if (d4 != null) {
            str = d4.getLanguage();
        } else {
            str = null;
        }
        if (str == null) {
            str = "en";
        }
        T1.a.a("BLE_LOG LanguageUtil, language is : " + str);
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        F.o(lowerCase, "toLowerCase(...)");
        T22 = A.T2(lowerCase, "zh", false, 2, null);
        if (T22) {
            language = LegalConfig.Language.CN;
        } else {
            String lowerCase2 = str.toLowerCase(locale);
            F.o(lowerCase2, "toLowerCase(...)");
            T23 = A.T2(lowerCase2, "de", false, 2, null);
            if (T23) {
                language = LegalConfig.Language.DE;
            } else {
                String lowerCase3 = str.toLowerCase(locale);
                F.o(lowerCase3, "toLowerCase(...)");
                T24 = A.T2(lowerCase3, "fr", false, 2, null);
                if (T24) {
                    language = LegalConfig.Language.FR;
                }
            }
        }
        T1.a.a("BLE_LOG LanguageUtil, langCode is : " + language);
        return language;
    }
}
