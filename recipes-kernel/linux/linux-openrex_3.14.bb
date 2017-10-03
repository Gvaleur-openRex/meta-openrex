# Copyright (C) 2012-2015 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP i.MX6 Linux kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on Freescale 3.14.52-1.1.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX6 based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

include linux-fslc.inc

#PV .= "+git${SRCPV}"
PV .= ""

SRCBRANCH = "jethro"
LOCALVERSION = "-fslc"

SRCREV = "f1dd5a0ffa9206d185cf3406ea037997d0cf5026"

SRC_URI = "git://github.com/Gvaleur-openRex/openrex-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex|imx6s-openrex)"
