DESCRIPTION = "Software to turn the RTL2832U into a SDR"
HOMEPAGE = "http://sdr.osmocom.org/trac/wiki/rtl-sdr"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "libusb1"

PV = "0.5.0+git"

SRC_URI = "git://git.osmocom.org/rtl-sdr"
SRCREV = "8c3a99c8f7a88d7d2a05845d4b20cfcdacac4054"

S = "${WORKDIR}/git"

inherit autotools lib_package

EXTRA_OECONF = "--enable-driver-detach"

do_install_append() {
	install -d ${D}${sysconfdir}/udev/rules.d
	install -m 0644 rtl-sdr.rules ${D}${sysconfdir}/udev/rules.d
}
