/*
 * Copyright (c) 2018, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.graalvm.polyglot.nativeapi.types;

import org.graalvm.nativeimage.c.struct.CPointerTo;
import org.graalvm.word.PointerBase;

/**
 * A pointer to a {@code uint16_t} value from `stdint.h` in C.
 *
 * @since 1.0
 */
@CPointerTo(nameOfCType = "uint16_t")
public interface CUnsignedShortPointer extends PointerBase {

    /**
     * Reads the value at the pointer address.
     *
     * @since 1.0
     */
    short read();

    /**
     * Writes the value at the pointer address.
     *
     * @since 1.0
     */
    void write(short value);

}
