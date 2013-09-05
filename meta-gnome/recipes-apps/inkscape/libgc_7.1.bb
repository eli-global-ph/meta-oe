DESCRIPTION = "Garbage collector for C and C++"
HOMEPAG	= "http://www.hpl.hp.com/personal/Hans_Boehm/gc/"

LICENSE	= "MIT"
LIC_FILES_CHKSUM = "file://include/gc_allocator.h;beginline=1;endline=36;md5=0ef89d5be2d9ffc475d63d257f62b44c"

SRC_URI = "http://www.hpl.hp.com/personal/Hans_Boehm/gc/gc_source/gc-${PV}.tar.gz"
SRC_URI[md5sum] = "2ff9924c7249ef7f736ecfe6f08f3f9b"
SRC_URI[sha256sum] = "e3cef6028fe3efe7de3bcf4107c880eae50b3ee79841450d885467c09bcebf30"

inherit autotools

S = "${WORKDIR}/gc-${PV}"

do_configure() {
	gnu-configize
	oe_runconf
}

LEAD_SONAME = "libgc.so.1"

FILES_${PN}-doc += "${datadir}/gc/"


