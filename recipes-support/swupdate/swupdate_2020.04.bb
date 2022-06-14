require swupdate.inc

SRCREV = "1a6dfbb5a0be978ac1a159758e278ab4d44167e2"

SRC_URI += "file://0001-diskpart-force-kernel-to-reread-partition-table.patch \
	    file://0001-Shellscript-stops-before-completing.patch \
	    file://0001-diskpart-fix-adding-more-as-4-partitions.patch \
	    file://1000-swupdate-zeus-enable-systemd-add-mmc-utils-ext4-cpio-resize2fs-L5.4.70-2.3.0.patch \
	    file://1001-swupdate-zeus-defconfig-w-security-L5.4.70-2.3.0.patch \
	    file://1002-swupdate-zeus-add-swupdate-sysrestart-security-L5.4.70-2.3.0.patch \
	    file://1003-swupdate-zeus-add-swupdate-cgi-swupdate_bbappend-L5.4.70-2.3.0.patch \
	    file://1100-swupdate-zeus-mask-recipes-devtools-L5.4.70-2.3.0.patch \
	    file://1101-swupdate-zeus-remove-no-necessary-app-in-swupdate-image-L5.4.70-2.3.0.patch \
	    "

# Building out of tree is broken in this version
B = "${S}"
