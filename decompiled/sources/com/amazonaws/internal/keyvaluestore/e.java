package com.amazonaws.internal.keyvaluestore;

import java.security.Key;

/* loaded from: classes.dex */
interface e {
    Key a(String str) throws KeyNotFoundException;

    void b(String str);

    Key c(String str) throws KeyNotGeneratedException;
}
