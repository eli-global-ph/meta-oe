SUMMARY = "These are the userspace tools required for bcache"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"

DEPENS = "util-linux"

PV = "0.0+git${SRCPV}"

SRCREV = "89f11b135d1d57a5dbdc3548bfb9bfa0113075c4"
SRC_URI = "git://evilpiepirate.org/git/bcache-tools.git;protocol=http \
           file://0001-don-t-inline-crc64-it-leads-to-link-failures.patch \
          "

S = "${WORKDIR}/git"

CFLAGS += " -std=gnu99 -I${STAGING_INCDIR}/blkid -I${STAGING_INCDIR}/uuid"

do_install() {
    install -d ${D}${sbindir}

    # Hardcoded in Makefile
    install -d ${D}/lib/udev/rules.d
    install -d ${D}${prefix}/share/man/man8

    oe_runmake install PREFIX=${prefix} DESTDIR=${D}
}

FILES_${PN}-dbg += "/lib/udev/.debug"
FILES_${PN} += "/lib/udev"

