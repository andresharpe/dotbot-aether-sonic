package com.amazonaws.internal.config;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f23733a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23734b;

    public a(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            try {
                Pattern.compile(str);
                if (str2 != null && !str2.isEmpty()) {
                    this.f23733a = str;
                    this.f23734b = str2;
                    return;
                }
                throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: regionName must be non-empty");
            } catch (PatternSyntaxException e4) {
                throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex is not a valid regex", e4);
            }
        }
        throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex must be non-empty");
    }

    public String a() {
        return this.f23733a;
    }

    public String b() {
        return this.f23734b;
    }
}
