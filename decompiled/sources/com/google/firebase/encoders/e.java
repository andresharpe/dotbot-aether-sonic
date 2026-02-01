package com.google.firebase.encoders;

import androidx.annotation.N;
import androidx.annotation.P;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface e {
    @N
    e a(@N c cVar, boolean z3) throws IOException;

    @N
    e b(@N c cVar, long j4) throws IOException;

    @N
    e c(@N c cVar, int i4) throws IOException;

    @N
    e e(@N c cVar, float f4) throws IOException;

    @N
    e f(@N c cVar) throws IOException;

    @N
    e g(@N c cVar, double d4) throws IOException;

    @N
    e h(@P Object obj) throws IOException;

    @N
    @Deprecated
    e i(@N String str, boolean z3) throws IOException;

    @N
    @Deprecated
    e j(@N String str, double d4) throws IOException;

    @N
    @Deprecated
    e k(@N String str, long j4) throws IOException;

    @N
    @Deprecated
    e l(@N String str, int i4) throws IOException;

    @N
    @Deprecated
    e o(@N String str, @P Object obj) throws IOException;

    @N
    e s(@N String str) throws IOException;

    @N
    e t(@N c cVar, @P Object obj) throws IOException;
}
