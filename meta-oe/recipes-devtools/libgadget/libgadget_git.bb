DESCRIPTION = "Libgadget is a C library encapsulating the kernel USB gadget-configfs userspace API functionality."

LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c"

PV = "0.0.1"

SRC_URI = "git://git.linaro.org/people/mporter/libgadget.git"
SRCREV = "8b074b73d1c31ae59b572bdf1c2cafce3a9c6f02"

inherit autotools lib_package

S = "${WORKDIR}/git"

