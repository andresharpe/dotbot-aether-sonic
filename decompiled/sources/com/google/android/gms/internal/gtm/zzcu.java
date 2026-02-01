package com.google.android.gms.internal.gtm;

import N0.a;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.v;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzcu extends zzbt {
    final zzct zza;

    public zzcu(zzbx zzbxVar, zzct zzctVar) {
        super(zzbxVar);
        this.zza = zzctVar;
    }

    private final zzcs zzb(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, a.C0015a.f1688b);
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim)) {
                            this.zza.zzb(attributeValue, trim);
                        }
                    } else if (lowerCase.equals(v.b.f7403e)) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, a.C0015a.f1688b);
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            this.zza.zze(attributeValue2, trim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, a.C0015a.f1688b);
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                this.zza.zzc(attributeValue3, Boolean.parseBoolean(trim3));
                            } catch (NumberFormatException e4) {
                                zzS("Error parsing bool configuration value", trim3, e4);
                            }
                        }
                    } else if (lowerCase.equals(v.b.f7400b)) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, a.C0015a.f1688b);
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                this.zza.zzd(attributeValue4, Integer.parseInt(trim4));
                            } catch (NumberFormatException e5) {
                                zzS("Error parsing int configuration value", trim4, e5);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e6) {
            zzJ("Error parsing tracker configuration file", e6);
        } catch (XmlPullParserException e7) {
            zzJ("Error parsing tracker configuration file", e7);
        }
        return this.zza.zza();
    }

    public zzcs zza(int i4) {
        try {
            return zzb(zzt().zzb().getResources().getXml(i4));
        } catch (Resources.NotFoundException e4) {
            zzR("inflate() called with unknown resourceId", e4);
            return null;
        }
    }
}
