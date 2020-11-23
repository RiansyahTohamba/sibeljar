-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2014 at 01:42 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_sibelajar`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_administrasi`
--

CREATE TABLE IF NOT EXISTS `tb_administrasi` (
  `id_akun` int(3) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id_akun`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `tb_administrasi`
--

INSERT INTO `tb_administrasi` (`id_akun`, `username`, `password`) VALUES
(1, 'rian', 'rian1'),
(2, 'riansyah', 'rian1');

-- --------------------------------------------------------

--
-- Table structure for table `tb_belajar_mengajar`
--

CREATE TABLE IF NOT EXISTS `tb_belajar_mengajar` (
  `id_pbm` int(11) NOT NULL AUTO_INCREMENT,
  `id_hari` char(5) NOT NULL,
  `id_kelas` int(2) NOT NULL,
  `jam` char(12) NOT NULL,
  `nip` int(3) NOT NULL,
  PRIMARY KEY (`id_pbm`),
  KEY `id_pbm` (`id_pbm`),
  KEY `id_hari` (`id_hari`),
  KEY `id_kelas` (`id_kelas`),
  KEY `nip` (`nip`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=55 ;

--
-- Dumping data for table `tb_belajar_mengajar`
--

INSERT INTO `tb_belajar_mengajar` (`id_pbm`, `id_hari`, `id_kelas`, `jam`, `nip`) VALUES
(1, '1', 11, '07.00-09.00', 1),
(2, '1', 11, '09.15-12.00', 3),
(3, '1', 11, '13.00-14.30', 4),
(4, '1', 12, '07.00-09.00', 4),
(5, '1', 12, '09.15-12.00', 3),
(6, '1', 12, '13.00-14.30', 6),
(7, '1', 13, '07.00-09.00', 7),
(8, '1', 13, '07.00-09.00', 2),
(9, '1', 13, '13.00-14.30', 5),
(10, '2', 11, '07.00-09.00', 2),
(11, '2', 11, '07.00-09.00', 4),
(12, '2', 11, '07.00-09.00', 6),
(13, '2', 12, '13.00-14.30', 8),
(14, '2', 12, '07.00-09.00', 10),
(15, '2', 12, '07.00-09.00', 12),
(16, '2', 13, '07.00-09.00', 14),
(17, '2', 13, '07.00-09.00', 15),
(18, '2', 13, '13.00-14.30', 13),
(19, '3', 11, '07.00-09.00', 5),
(20, '3', 11, '07.00-09.00', 9),
(21, '3', 11, '07.00-09.00', 10),
(22, '3', 12, '07.00-09.00', 1),
(23, '3', 12, '07.00-09.00', 2),
(24, '3', 12, '07.00-09.00', 5),
(25, '3', 13, '07.00-09.00', 3),
(26, '3', 13, '07.00-09.00', 8),
(27, '3', 13, '07.00-09.00', 4),
(28, '4', 11, '07.00-09.00', 13),
(29, '4', 11, '07.00-09.00', 14),
(30, '4', 11, '07.00-09.00', 15),
(31, '4', 12, '07.00-09.00', 12),
(32, '4', 12, '07.00-09.00', 11),
(33, '4', 12, '07.00-09.00', 7),
(34, '4', 13, '07.00-09.00', 1),
(35, '4', 13, '07.00-09.00', 5),
(36, '4', 13, '07.00-09.00', 6),
(37, '5', 11, '07.00-09.00', 3),
(38, '5', 11, '07.00-09.00', 1),
(39, '5', 11, '07.00-09.00', 2),
(40, '5', 12, '07.00-09.00', 12),
(41, '5', 12, '07.00-09.00', 10),
(42, '5', 12, '07.00-09.00', 14),
(43, '5', 13, '07.00-09.00', 11),
(44, '5', 13, '07.00-09.00', 9),
(45, '5', 13, '07.00-09.00', 15),
(46, '6', 11, '07.00-09.00', 12),
(47, '6', 11, '07.00-09.00', 11),
(48, '6', 11, '07.00-09.00', 6),
(49, '6', 12, '07.00-09.00', 3),
(50, '6', 12, '07.00-09.00', 7),
(51, '6', 12, '07.00-09.00', 8),
(52, '6', 13, '07.00-09.00', 15),
(53, '6', 13, '07.00-09.00', 9),
(54, '6', 13, '07.00-09.00', 4);

-- --------------------------------------------------------

--
-- Table structure for table `tb_guru`
--

CREATE TABLE IF NOT EXISTS `tb_guru` (
  `nip` int(3) NOT NULL AUTO_INCREMENT,
  `nama` varchar(55) NOT NULL,
  `id_mapel` int(2) NOT NULL,
  PRIMARY KEY (`nip`),
  KEY `nrp_pengajar` (`nip`),
  KEY `id_mapel` (`id_mapel`),
  KEY `id_mapel_2` (`id_mapel`),
  KEY `id_mapel_3` (`id_mapel`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `tb_guru`
--

INSERT INTO `tb_guru` (`nip`, `nama`, `id_mapel`) VALUES
(1, 'Romi Satria Wahono', 1),
(2, 'Onno W Purbo', 1),
(3, 'Budi Raharjo', 2),
(4, 'Rinaldi Munir', 3),
(5, 'Fajar Darmawan', 4),
(6, 'Iwan Kurniawan', 5),
(7, 'Hendra Komara', 6),
(8, 'Caca E. Supriana', 7),
(9, 'Agus Hexagraha', 8),
(10, 'Mellya Liyanti', 9),
(11, 'Rita Rijayanti', 10),
(12, 'Yeni Fatman', 5),
(13, 'Ayi Purbasari', 7),
(14, 'Ririn Dwi Agustin', 9),
(15, 'Anggoro Ari Nurcahyo', 3);

-- --------------------------------------------------------

--
-- Table structure for table `tb_hari`
--

CREATE TABLE IF NOT EXISTS `tb_hari` (
  `id_hari` char(5) NOT NULL,
  `hari` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_hari`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_hari`
--

INSERT INTO `tb_hari` (`id_hari`, `hari`) VALUES
('1', 'Senin'),
('2', 'Selasa'),
('3', 'Rabu'),
('4', 'Kamis'),
('5', 'Jumat'),
('6', 'Sabtu');

-- --------------------------------------------------------

--
-- Table structure for table `tb_kelas`
--

CREATE TABLE IF NOT EXISTS `tb_kelas` (
  `id_kelas` int(2) NOT NULL AUTO_INCREMENT,
  `kelas` varchar(10) NOT NULL,
  PRIMARY KEY (`id_kelas`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=39 ;

--
-- Dumping data for table `tb_kelas`
--

INSERT INTO `tb_kelas` (`id_kelas`, `kelas`) VALUES
(11, 'I-1'),
(12, 'I-2'),
(13, 'I-3'),
(14, 'I-4'),
(15, 'I-5'),
(16, 'I-6'),
(17, 'I-7'),
(18, 'I-8'),
(21, 'II-1'),
(22, 'II-2'),
(23, 'II-3'),
(24, 'II-4'),
(25, 'II-5'),
(26, 'II-6'),
(27, 'II-7'),
(28, 'II-8'),
(31, 'III-1 '),
(32, 'III-2'),
(33, 'III-3'),
(34, 'III-4'),
(35, 'III-5'),
(36, 'III-6'),
(37, 'III-7'),
(38, 'III-8');

-- --------------------------------------------------------

--
-- Table structure for table `tb_matapelajaran`
--

CREATE TABLE IF NOT EXISTS `tb_matapelajaran` (
  `id_mapel` int(2) NOT NULL AUTO_INCREMENT,
  `nama` varchar(100) NOT NULL,
  PRIMARY KEY (`id_mapel`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `tb_matapelajaran`
--

INSERT INTO `tb_matapelajaran` (`id_mapel`, `nama`) VALUES
(1, 'Matematika'),
(2, 'Kimia'),
(3, 'Biologi'),
(4, 'Fisika'),
(5, 'Agama'),
(6, 'Bahasa Inggris'),
(7, 'Bahasa Indonesia'),
(8, 'Bahasa Arab'),
(9, 'Bahasa Jerman'),
(10, 'Bahasa Jepang');

-- --------------------------------------------------------

--
-- Table structure for table `tb_materi`
--

CREATE TABLE IF NOT EXISTS `tb_materi` (
  `id_materi` int(4) NOT NULL AUTO_INCREMENT,
  `bab` char(100) NOT NULL,
  `id_mapel` int(2) NOT NULL,
  PRIMARY KEY (`id_materi`),
  KEY `id_mapel` (`id_mapel`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `tb_materi`
--

INSERT INTO `tb_materi` (`id_materi`, `bab`, `id_mapel`) VALUES
(1, '1. Pengantar Matematika', 1),
(2, '2. Jenis Bilangan', 1),
(3, '3. Sistem Persamaan Linear Dua Variabel', 1),
(4, '4. Integral', 1),
(5, '5. Diferensial', 1),
(6, '1. Pengantar Kimia', 2),
(7, '2. Unsur-unsur Kimia', 2),
(8, '3. Unsur Halogen', 2),
(9, '4. Unsur Gas Mulia', 2),
(10, '5. Analisis Unsur', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tb_presensi`
--

CREATE TABLE IF NOT EXISTS `tb_presensi` (
  `pertemuan` int(3) DEFAULT NULL,
  `status_kehadiran` varchar(10) DEFAULT NULL,
  `id_presensi` int(8) NOT NULL AUTO_INCREMENT,
  `tanggal` date DEFAULT NULL,
  `id_pbm` int(11) NOT NULL,
  `nis` varchar(9) NOT NULL,
  `berita_acara` text NOT NULL,
  `id_materi` int(4) NOT NULL,
  PRIMARY KEY (`id_presensi`),
  KEY `id_pbm` (`id_pbm`),
  KEY `nis` (`nis`),
  KEY `id_materi` (`id_materi`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1011 ;

--
-- Dumping data for table `tb_presensi`
--

INSERT INTO `tb_presensi` (`pertemuan`, `status_kehadiran`, `id_presensi`, `tanggal`, `id_pbm`, `nis`, `berita_acara`, `id_materi`) VALUES
(1, 'tidak', 1, '2014-11-17', 1, '113020036', 'Semua siswa hadir, pelajaran disampaikan relatif tidak sulit', 1),
(1, 'tidak', 2, NULL, 1, '113030039', 'Semua siswa hadir, pelajaran disampaikan relatif tidak sulit', 1),
(1, 'tidak', 3, NULL, 1, '113040150', 'Semua siswa hadir, pelajaran disampaikan relatif tidak sulit', 1),
(1, 'tidak', 4, NULL, 1, '113040233', 'Semua siswa hadir, pelajaran disampaikan relatif tidak sulit', 1),
(2, 'hadir', 5, '2014-10-19', 1, '113020036', 'Semua siswa hadir, pelajaran disampaikan relatif tidak sulit', 2),
(2, 'hadir', 6, '2014-10-19', 1, '113030039', 'Semua siswa hadir, pelajaran disampaikan relatif tidak sulit', 2),
(2, 'hadir', 7, '2014-10-19', 1, '113040150', 'Semua siswa hadir, pelajaran disampaikan relatif tidak sulit', 2),
(2, 'hadir', 8, '2014-10-19', 1, '113040233', 'Semua siswa hadir, pelajaran disampaikan relatif tidak sulit', 2),
(3, 'tidak', 9, '2014-10-29', 1, '113020036', 'Terdapat siswa yang tidak hadir, pelajaran disampaikan sudah memasuki bab permulaan', 3),
(3, 'tidak', 10, '2014-10-29', 1, '113030039', 'Terdapat siswa yang tidak hadir, pelajaran disampaikan sudah memasuki bab permulaan', 3),
(3, 'hadir', 11, '2014-10-29', 1, '113040150', 'Terdapat siswa yang tidak hadir, pelajaran disampaikan sudah memasuki bab permulaan', 3),
(3, 'hadir', 12, '2014-10-29', 1, '113040233', 'Terdapat siswa yang tidak hadir, pelajaran disampaikan sudah memasuki bab permulaan', 3),
(4, 'hadir', 13, '2014-10-29', 1, '113020036', 'Terdapat siswa yang tidak hadir, pelajaran disampaikan sudah memasuki bab pertengahan', 1),
(4, 'hadir', 14, '2014-10-29', 1, '113030039', 'Terdapat siswa yang tidak hadir, pelajaran disampaikan sudah memasuki bab pertengahan', 1),
(4, 'hadir', 15, '2014-10-29', 1, '113040150', 'Terdapat siswa yang tidak hadir, pelajaran disampaikan sudah memasuki bab pertengahan', 1),
(4, 'hadir', 16, '2014-10-29', 1, '113040233', 'Terdapat siswa yang tidak hadir, pelajaran disampaikan sudah memasuki bab pertengahan', 1),
(5, 'hadir', 871, NULL, 1, '123020001', 'materi disampaika dengan baik ', 5),
(5, 'hadir', 872, NULL, 1, '123020005', 'materi disampaika dengan baik ', 5),
(5, 'hadir', 873, NULL, 1, '123010137', 'materi disampaika dengan baik ', 5),
(5, 'hadir', 874, NULL, 1, '113030039', 'materi disampaika dengan baik ', 5),
(5, 'hadir', 875, NULL, 1, '113040234', 'materi disampaika dengan baik ', 5),
(5, 'hadir', 876, NULL, 1, '123020011', 'materi disampaika dengan baik ', 5),
(5, 'hadir', 877, NULL, 1, '123020013', 'materi disampaika dengan baik ', 5),
(5, 'hadir', 878, NULL, 1, '113040150', 'materi disampaika dengan baik ', 5),
(5, 'hadir', 879, NULL, 1, '123020003', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 880, NULL, 1, '123020002', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 881, NULL, 1, '123020009', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 882, NULL, 1, '113040257', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 883, NULL, 1, '123020007', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 884, NULL, 1, '113020036', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 885, NULL, 1, '123020006', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 886, NULL, 1, '123020004', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 887, NULL, 1, '123020010', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 888, NULL, 1, '113040233', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 889, NULL, 1, '123020008', 'materi disampaika dengan baik ', 5),
(5, 'tidak', 890, NULL, 1, '123020012', 'materi disampaika dengan baik ', 5),
(1, 'hadir', 891, NULL, 2, '123020001', 'baru memulai kelas kimia', 6),
(1, 'hadir', 892, NULL, 2, '123020005', 'baru memulai kelas kimia', 6),
(1, 'hadir', 893, NULL, 2, '123010137', 'baru memulai kelas kimia', 6),
(1, 'hadir', 894, NULL, 2, '113030039', 'baru memulai kelas kimia', 6),
(1, 'hadir', 895, NULL, 2, '113040234', 'baru memulai kelas kimia', 6),
(1, 'hadir', 896, NULL, 2, '123020011', 'baru memulai kelas kimia', 6),
(1, 'hadir', 897, NULL, 2, '123020013', 'baru memulai kelas kimia', 6),
(1, 'tidak', 898, NULL, 2, '113040150', 'baru memulai kelas kimia', 6),
(1, 'tidak', 899, NULL, 2, '123020003', 'baru memulai kelas kimia', 6),
(1, 'tidak', 900, NULL, 2, '123020002', 'baru memulai kelas kimia', 6),
(1, 'tidak', 901, NULL, 2, '123020009', 'baru memulai kelas kimia', 6),
(1, 'tidak', 902, NULL, 2, '113040257', 'baru memulai kelas kimia', 6),
(1, 'tidak', 903, NULL, 2, '123020007', 'baru memulai kelas kimia', 6),
(1, 'tidak', 904, NULL, 2, '113020036', 'baru memulai kelas kimia', 6),
(1, 'tidak', 905, NULL, 2, '123020006', 'baru memulai kelas kimia', 6),
(1, 'tidak', 906, NULL, 2, '123020004', 'baru memulai kelas kimia', 6),
(1, 'tidak', 907, NULL, 2, '123020010', 'baru memulai kelas kimia', 6),
(1, 'tidak', 908, NULL, 2, '113040233', 'baru memulai kelas kimia', 6),
(1, 'tidak', 909, NULL, 2, '123020008', 'baru memulai kelas kimia', 6),
(1, 'tidak', 910, NULL, 2, '123020012', 'baru memulai kelas kimia', 6);

-- --------------------------------------------------------

--
-- Table structure for table `tb_siswa`
--

CREATE TABLE IF NOT EXISTS `tb_siswa` (
  `nis` varchar(9) NOT NULL,
  `nama` varchar(35) DEFAULT NULL,
  `jenis_kelamin` char(1) DEFAULT NULL,
  `kontak` varchar(13) DEFAULT NULL,
  `alamat` varchar(30) DEFAULT NULL,
  `id_kelas` int(11) NOT NULL,
  PRIMARY KEY (`nis`),
  KEY `id_kelas` (`id_kelas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_siswa`
--

INSERT INTO `tb_siswa` (`nis`, `nama`, `jenis_kelamin`, `kontak`, `alamat`, `id_kelas`) VALUES
('113020036', 'riansyah', 'P', '0282828282', 'Jln Mekar', 11),
('113030039', 'Feri Etrawan', 'L', '089012345678', 'Psir Inpun, Cicaheum', 11),
('113040150', 'iqbal', 'P', '085756603194', 'Jln Mekar No 25 I', 11),
('113040233', 'Siti Fauzia Khairunnisa', 'P', '09809897831', 'Padalarang', 11),
('113040234', 'Guskar', 'L', '0898989892', 'Jl. Setiabudi No. 193', 11),
('113040257', 'Mohamad Rahmatuloh', 'L', '081220485102', 'Gegerkalong Tengah No. 50', 11),
('123010137', 'Diana Rizky A. ', 'L', '0817867617671', 'Cipasnas', 11),
('123020001', 'Anis Matta', 'P', '09927489729', 'Sukasari', 11),
('123020002', 'Kira', 'P', '09927489729', 'Sukasari', 11),
('123020003', 'Itachi', 'P', '09927489729', 'Sukasari', 11),
('123020004', 'Sasuke', 'P', '09927489729', 'Sukasari', 11),
('123020005', 'Bryan', 'P', '09927489729', 'Sukasari', 11),
('123020006', 'Roger', 'P', '09927489729', 'Sukasari', 11),
('123020007', 'Pressman', 'P', '09927489729', 'Sukasari', 11),
('123020008', 'Tobi', 'P', '09927489729', 'Sukasari', 11),
('123020009', 'Madara', 'P', '09927489729', 'Sukasari', 11),
('123020010', 'Senju', 'P', '09927489729', 'Sukasari', 11),
('123020011', 'Hashirama', 'P', '09927489729', 'Sukasari', 11),
('123020012', 'Uciha', 'P', '09927489729', 'Sukasari', 11),
('123020013', 'Ichigo', 'P', '09927489729', 'Sukasari', 11),
('123020014', 'Obito', 'P', '09927489729', 'Sukasari', 12),
('123020015', 'Kakashi', 'P', '09927489729', 'Sukasari', 12),
('123020016', 'Luffy', 'P', '09927489729', 'Sukasari', 12),
('123020017', 'Tifatul Sembiring', 'P', '09927489729', 'Sukasari', 12),
('123020062', 'Yoga Purnama N.', 'L', '089786735615', 'Gg. Sempit', 12),
('123020101', 'Anis Hamidah ', 'P', '09927489729', 'Sukasari', 12),
('123040226', 'Riansyah', 'L', '085756603194', 'Jln Mekar', 12),
('133010001', 'TEDI RESTIADI', 'L', '0837373732828', NULL, 12),
('133010002', 'MUHAMMAD REZA PRIMAYANDI', 'L', NULL, NULL, 12),
('133010003', 'GALIH NUR MUHAMAD', 'L', NULL, NULL, 12),
('133010004', 'SUPARMAN FAIZAL', 'L', NULL, NULL, 12),
('133010005', 'RIDWAN MAULANA', 'L', NULL, NULL, 12),
('133010006', 'AGUNG GUMELAR', 'L', NULL, NULL, 12),
('133010007', 'SABILA FIRDAUS', 'L', NULL, NULL, 12),
('133010008', 'MOCH NURHIDAYAT', 'L', NULL, NULL, 12),
('133010009', 'GILANG ALGHIFARI', 'L', NULL, NULL, 12),
('133010010', 'DIDIK ARIYANTO', 'L', NULL, NULL, 12),
('133010011', 'SEPTIAN PUJA MAHARDIKA', 'L', NULL, NULL, 12),
('133010012', 'GYA MARSELA', 'P', NULL, NULL, 12),
('133010013', 'AGUNG ADITYA FEBRI', 'L', NULL, NULL, 12),
('133010014', 'ADITYA RIZKI PRASETYO', 'L', NULL, NULL, 13),
('133010015', 'YULIAWATI GUSWARA PUTRI', 'P', NULL, NULL, 13),
('133010016', 'BRAM LODEWIJK PICAULY', 'L', NULL, NULL, 13),
('133010017', 'SEFTIAN IRHAF', 'L', NULL, NULL, 13),
('133010018', 'ABYAN HAFIZH RAIHAN', 'L', NULL, NULL, 13),
('133010019', 'MOCH RIFQY NURFAZA', 'L', NULL, NULL, 13),
('133010020', 'YOPI MARLAN', 'L', NULL, NULL, 13),
('133010021', 'DYAN MAHARDIKA', 'L', NULL, NULL, 13),
('133010022', 'AYU KHARISMA PUTRI', 'P', NULL, NULL, 13),
('133010024', 'HANIFAH FAUZIYAH NIBRAS', 'P', NULL, NULL, 13),
('133010025', 'TITO KURNIAWAN', 'L', NULL, NULL, 13),
('133010027', 'RADEN SABRINA EVANS', 'P', NULL, NULL, 13),
('133010028', 'RADEN MUHAMMAD YUSUF KURNIA', 'L', NULL, NULL, 13),
('133010029', 'RIYAN SULISTYAWAN', 'L', NULL, NULL, 13),
('133010030', 'MEGA SUKARNAPUTRI', 'P', NULL, NULL, 13),
('133010031', 'REZA PUTRA', 'L', NULL, NULL, 13),
('133010032', 'RIZKA DWI OKTAVIANA', 'P', NULL, NULL, 13),
('133010033', 'JUNJUNAN RAMADHAN ARYADI', 'L', NULL, NULL, 13),
('133010034', 'ASEP HIDAYAT HS', 'L', NULL, NULL, 13),
('133010035', 'GISCHA YUSTISIA SLAMET TRINAND', 'P', NULL, NULL, 13),
('133010036', 'ROBY MULYADI', 'L', NULL, NULL, 0),
('133010037', 'TRISNA WIKI PERMANA', 'L', NULL, NULL, 0),
('133010039', 'DANI RAMDANI', 'L', NULL, NULL, 0),
('133010040', 'WAHYU NUGROHO', 'L', NULL, NULL, 0),
('133010041', 'MUHAMMAD REXY SAPTARI', 'L', NULL, NULL, 0),
('133010042', 'TAUFIK SATRIAWAN', 'L', NULL, NULL, 0),
('133010043', 'LENI LISTIANAWATI', 'P', NULL, NULL, 0),
('133010044', 'NURUL MAGFIRA HARFI', 'P', NULL, NULL, 0),
('133010045', 'BUDIMAN', 'L', NULL, NULL, 0),
('133010047', 'AGAM SEFTIAWAN', 'L', NULL, NULL, 0),
('133010048', 'DICKY RANDA P', 'L', NULL, NULL, 0),
('133010049', 'IRVAN NURDIANA', 'L', NULL, NULL, 0),
('133010050', 'SUCAHYO PRASETYONO', 'L', NULL, NULL, 0),
('133010051', 'MUHAMMAD RIDHOTULLAH SAIDA', 'L', NULL, NULL, 0),
('133010052', 'JULIAN SURYA KUSUMAH PRAJA', 'L', NULL, NULL, 0),
('133010053', 'NOVIK IRMAWAN', 'L', NULL, NULL, 0),
('133010054', 'FACHRY ANDARA SUKMA', 'L', NULL, NULL, 0),
('133010055', 'EDWIN FADEL MUHAMMAD', 'L', NULL, NULL, 0),
('133010056', 'MUHAMAD MASYKUR', 'L', NULL, NULL, 0),
('133010057', 'RENDY FEBRIAN', 'L', NULL, NULL, 0),
('133010058', 'RIA ELISABET TAMPUBOLON', 'P', NULL, NULL, 0),
('133010059', 'HERIN SEPTIAN', 'L', NULL, NULL, 0),
('133010060', 'RIZAL PACHLEVI', 'L', NULL, NULL, 0),
('133010061', 'AMMAR NATSIR', 'L', NULL, NULL, 0),
('133010062', 'INDRI RAMADIANSYAH', 'L', NULL, NULL, 0),
('133010063', 'AKMAL AKHMADIPURA', 'L', NULL, NULL, 0),
('133010064', 'SATRIO TAUFIK INDARMAN', 'L', NULL, NULL, 0),
('133010065', 'REVINDO DARMA PRATAMA', 'L', NULL, NULL, 0),
('133010066', 'YOGA AGUNG PRATAMA', 'L', NULL, NULL, 0),
('133010067', 'TB NAWIR GALBY', 'L', NULL, NULL, 0),
('133010068', 'DEDEN YUSUF', 'L', NULL, NULL, 0),
('133010069', 'AHMAD FADHILAH', 'L', NULL, NULL, 0),
('133010070', 'CEPI SUPRIADI', 'L', NULL, NULL, 0),
('133010071', 'CHAKRA DANISHAWARA', 'L', NULL, NULL, 0),
('133010073', 'SUWARDI', 'L', NULL, NULL, 0),
('133010074', 'ETHANTO LAIL HAKIM', 'L', NULL, NULL, 0),
('133010075', 'CEPY CHURNIANTO', 'L', NULL, NULL, 0),
('133010076', 'DYAH RARA AYU PANDANWANGI', 'P', NULL, NULL, 0),
('133010077', 'DHIA MALIKA REYHANANDAR', 'L', NULL, NULL, 0),
('133010078', 'JAUDAT WAFA', 'L', NULL, NULL, 0),
('133010079', 'BAGUS WIDANTOKO', 'L', NULL, NULL, 0),
('133010080', 'THIO YUSHARDIANSYAH', 'L', NULL, NULL, 0),
('133010081', 'MOCH. FAUZI NURRAMDHAN', 'L', NULL, NULL, 0),
('133010082', 'EKO FIRMAN FADILAH', 'L', NULL, NULL, 0),
('133010083', 'NELLA INFANDI YOLANDA DEVI', 'P', NULL, NULL, 0),
('133010084', 'ASEP MEI NURIANA', 'L', NULL, NULL, 0),
('133010085', 'M. YUSA BADRU TAMAM', 'L', NULL, NULL, 0),
('133010086', 'MOHAMMAD ANDRIE ANCER RIDWAN', 'L', NULL, NULL, 0),
('133010087', 'AGUNG ROCHMAT', 'L', NULL, NULL, 0),
('133010088', 'HERMANTO RAMADHAN', 'L', NULL, NULL, 0),
('133010089', 'ADHIYA KANDIANA', 'L', NULL, NULL, 0),
('133010090', 'ACENG KURNIA', 'L', NULL, NULL, 0),
('133010091', 'IBRAHIM FAHMI', 'L', NULL, NULL, 0),
('133010092', 'ALFIAN ANDI FATULLAH', 'L', NULL, NULL, 0),
('133010093', 'ENDRIYANTO', 'L', NULL, NULL, 0),
('133010094', 'EKA ROMANTIKA', 'L', NULL, NULL, 0),
('133010095', 'NOVA PUSPITASARI', 'P', '08262727272', 'jln mekar', 0),
('133010096', 'AKHMAD YUSUF SUBAGJA', 'L', NULL, NULL, 0),
('133010097', 'RULI SEPTIAN', 'L', NULL, NULL, 0),
('133010098', 'KHARISMA SUYUDI', 'L', NULL, NULL, 0),
('133010099', 'EKA PERMANA', 'L', NULL, NULL, 0),
('133010100', 'YAYANG WIJAYA', 'L', NULL, NULL, 0),
('133010101', 'FAUZY RAMDHANI', 'L', NULL, NULL, 0),
('133010102', 'RIAN RAMDHANI', 'L', NULL, NULL, 0),
('133010103', 'ROSYIHAN ANWAR', 'L', NULL, NULL, 0),
('133010104', 'DAVID PRAKOSO', 'L', NULL, NULL, 0),
('133010105', 'DIKI SOPANDI', 'L', NULL, NULL, 0),
('133010106', 'GERI YOLANDA', 'L', NULL, NULL, 0),
('133010107', 'IRFANDANI EKA BUDI PRATOMO', 'L', NULL, NULL, 0),
('133010108', 'ATIKA SATIARIDA', 'P', NULL, NULL, 0),
('133010109', 'MUHAMMAD ZULFAH FAUZAN SUKARNA', 'L', NULL, NULL, 0),
('133010110', 'ASEP SYAMSUDDIN ABDUL CHOLIQ', 'L', NULL, NULL, 0),
('133010111', 'DIAN AJI PERMANA', 'L', NULL, NULL, 0),
('133010112', 'LUTFI ALFIRAZ', 'L', NULL, NULL, 0),
('133010113', 'ANTO INGDRIANTO', 'L', NULL, NULL, 0),
('133010114', 'BABY TASYA HANAAN', 'P', NULL, NULL, 0),
('133010115', 'THEO RIZKY PRANATA', 'L', NULL, NULL, 0),
('133010116', 'NAILATUS SAFA''AH', 'P', NULL, NULL, 0),
('133010117', 'AGI SUHARYADI', 'L', NULL, NULL, 0),
('133010118', 'DENI SUHERLAN', 'L', NULL, NULL, 0),
('133010119', 'HAMKA DWI PUTRA', 'L', NULL, NULL, 0),
('133010120', 'DESI SOLEKHA', 'P', NULL, NULL, 0),
('133010121', 'SAFIRA AUDINA', 'P', NULL, NULL, 0),
('133010122', 'INDRA HENDRAWAN', 'L', NULL, NULL, 0),
('133010123', 'ISFAN FAJAR SAWITO', 'L', NULL, NULL, 0),
('133010124', 'HASTIA MAULIDAH', 'P', NULL, NULL, 0),
('133010125', 'FIKRY', 'L', NULL, NULL, 0),
('133010126', 'GIA RIDWAN RAMADHAN', 'L', NULL, NULL, 0),
('133010127', 'MUHAMMA AZHAR NURFAUZI', 'L', NULL, NULL, 0),
('133010128', 'MILA FATMAWATI', 'P', NULL, NULL, 0),
('133010129', 'NURUL IMAN', 'L', NULL, NULL, 0),
('133010130', 'GIAN AGUNG DWI PUTRA', 'L', NULL, NULL, 0),
('133010131', 'RANDY KURNIAWAN', 'L', NULL, NULL, 0),
('133010132', 'MUHAMAD HARIZ YUDHA', 'L', NULL, NULL, 0),
('133010133', 'OGI NADA SAPUTRA', 'L', NULL, NULL, 0),
('133010134', 'MOCHAMAD NIZAR ZUL FAHMI', 'L', NULL, NULL, 0),
('133010135', 'A. MALIK FAJAR H', 'L', NULL, NULL, 0),
('133010136', 'SANDI RAHAYU', 'L', NULL, NULL, 0),
('133010137', 'MUHARDI ARI AFDHAL', 'L', NULL, NULL, 0),
('133010138', 'RIZKY MAULANA PUTRA', 'L', NULL, NULL, 0),
('133010139', 'MUHAMAD IRFAI', 'L', NULL, NULL, 0),
('133010140', 'NURUDIN RAHMAN', 'L', NULL, NULL, 0),
('133010141', 'DIDIH BUDIANA', 'L', NULL, NULL, 0),
('133010142', 'TRI PUSPITA SARI', 'P', NULL, NULL, 0),
('133010143', 'TIODOVA SATRIA WIDODO', 'L', NULL, NULL, 0),
('133010144', 'ANDIKA PERMANA', 'L', NULL, NULL, 0),
('133010145', 'JULDI SYARA ROMDANI KOSIM', 'L', NULL, NULL, 0),
('133010146', 'NADIA INDIRA PURI', 'P', NULL, NULL, 0),
('133010147', 'VEBINA SHEILA PASHA', 'P', NULL, NULL, 0),
('133010148', 'YURI ERDIANSYAH', 'L', NULL, NULL, 0),
('133010149', 'RADEN MUHAMAD SEPTIANA ISKANDA', 'L', NULL, NULL, 0),
('133010150', 'PUSPITA SARI', 'P', NULL, NULL, 0),
('133010151', 'LUTHFIA LISMAWAN SUWANDI', 'P', NULL, NULL, 0),
('133010152', 'WINA AYU WIFTIANI', 'P', NULL, NULL, 0),
('133010153', 'ALIEF IBNUWIBOWO', 'L', NULL, NULL, 0),
('133010154', 'CANDRA RESTU PAKARTI', 'L', NULL, NULL, 0),
('133010155', 'TRUELY ANUGRAH UTAMA', 'L', NULL, NULL, 0),
('133010156', 'ADI MAIDA SUHAN', 'L', NULL, NULL, 0),
('133010157', 'HERRY YULIANTO', 'L', NULL, NULL, 0),
('133010158', 'IWALDI EBEN EZER V. SIMAREMARE', 'L', NULL, NULL, 0),
('133010159', 'JAYANTI MONALISA', 'P', NULL, NULL, 0),
('133010160', 'MUH. AFIF ALAUDDIN', 'L', NULL, NULL, 0),
('133010161', 'RADEN MUHAMAD HIRAWAN RAMDANI', 'L', NULL, NULL, 0),
('133010162', 'ADHADI FARIJAL YUNUS', 'L', NULL, NULL, 0),
('133010164', 'TIA WAHYUNI', 'P', NULL, NULL, 0),
('133010165', 'ABU DODO SUARYO', 'L', NULL, NULL, 0),
('133010166', 'MOHAMAD YOHANDI', 'L', NULL, NULL, 0),
('133010167', 'MUHAMMAD SALMAN AL-AZIZ', 'L', NULL, NULL, 0),
('133010168', 'RINTO PRIBADI', 'L', NULL, NULL, 0),
('133010169', 'TRY PRIATNA', 'L', NULL, NULL, 0),
('133010170', 'MUHAMAD PARID', 'L', NULL, NULL, 0),
('133010171', 'DHAFIN HERJAYA PUTRA', 'L', NULL, NULL, 0),
('133010172', 'SAYID GHAFAR', 'L', NULL, NULL, 0),
('133010173', 'RIFQI ROFIEQ', 'L', NULL, NULL, 0),
('133010174', 'RIZALDI MUTAQIN', 'L', NULL, NULL, 0),
('133010175', 'JAJANG NURJAMAN', 'L', NULL, NULL, 0),
('133010176', 'EKO FITRIANTO', 'L', NULL, NULL, 0),
('133010177', 'FEBY ANISYARA SUCITRA', 'P', NULL, NULL, 0),
('133010178', 'MUHAMMAD DIMAS FARHAN', 'L', NULL, NULL, 0),
('133010179', 'MUHAMMAD HARISZ RYADI', 'L', NULL, NULL, 0),
('133010180', 'SUWANDIN', 'L', NULL, NULL, 0),
('133010181', 'R.RIZKY AKBAR AHMAD NOER', 'L', NULL, NULL, 0),
('133010182', 'IKA ASTUTI HANDAYANI', 'P', NULL, NULL, 0),
('133010183', 'RISKY SUCIARINI', 'P', NULL, NULL, 0),
('133010184', 'ASKAR BAHARI', 'L', NULL, NULL, 0),
('133010185', 'AHMAD FAISAL NURCHOLIS', 'L', NULL, NULL, 0),
('133010186', 'GEGEN PERMADA', 'L', NULL, NULL, 0),
('133010187', 'IRFAN MARSYAL NUGRAHA', 'L', NULL, NULL, 0),
('133010188', 'ANDI MUHAMAD RIKMAN WIJAYA', 'L', NULL, NULL, 0),
('133010189', 'AYU NOVA RAHMAWATI', 'P', NULL, NULL, 0),
('133010190', 'IMAN TAUFIK', 'L', NULL, NULL, 0),
('133010191', 'SANDRA ALLIYUSUFI', 'L', NULL, NULL, 0),
('133010192', 'MUHAMAD ILHAM RISMAWAN', 'L', NULL, NULL, 0),
('133010193', 'SUDIATI NURLITASARI', 'P', NULL, NULL, 0),
('133010194', 'REZA DOVIANDA PUTRA', 'L', NULL, NULL, 0),
('133010195', 'LABIB LUKMAN', 'L', NULL, NULL, 0),
('133010196', 'WIRA WIJAYA', 'L', NULL, NULL, 0),
('133010197', 'LUKMAN HAKIM', 'L', NULL, NULL, 0),
('133010198', 'IMAN WIGUNA', 'L', NULL, NULL, 0),
('133010199', 'WAHID GUNAWAN', 'L', NULL, NULL, 0),
('133010200', 'GELLIS BERLIAN ANJARA', 'L', NULL, NULL, 0),
('133010201', 'RAHMAD TRI MULYADI', 'L', NULL, NULL, 0),
('133010202', 'MUHAMMAD ABDURRAHMAN NAUFAL', 'L', NULL, NULL, 0),
('133010203', 'YUDI SURYATNO', 'L', NULL, NULL, 0),
('133010204', 'VARIAN ASHARI MUHAMAD', 'L', NULL, NULL, 0),
('133010205', 'RIZKI FAISAL OKTAVIANSYAH', 'L', NULL, NULL, 0),
('133010206', 'RANGGA NUGRAHA', 'L', NULL, NULL, 0),
('133010207', 'IQBAL MUHSAL Y,', 'L', NULL, NULL, 0),
('133010208', 'REGINA SITUMORANG', 'P', NULL, NULL, 0),
('133010209', 'POLOS ANGGOLA', 'L', NULL, NULL, 0),
('133010210', 'FAHMYNUR CAHYANTO', 'L', NULL, NULL, 0),
('133010211', 'ARIF RAHMAN HARDIAN', 'L', NULL, NULL, 0),
('133010212', 'RANDI NUGRAHA', 'L', NULL, NULL, 0),
('133010213', 'MUHAMAD MUJIB AJIJI', 'L', NULL, NULL, 0),
('133010214', 'MUHAMAD INDRA PERMANA', 'L', NULL, NULL, 0),
('133010215', 'ACEP DANI KUSUMA WARDI', 'L', NULL, NULL, 0),
('133010216', 'RIZKY JATNIKA', 'L', NULL, NULL, 0),
('133010217', 'RIFKY MUHAMAD JUDIT PUTRA', 'L', NULL, NULL, 0),
('133010218', 'ASEP NASRUDIN SAEROJI', 'L', NULL, NULL, 0),
('133010219', 'RIVALDA NUGRAHA', 'L', NULL, NULL, 0),
('133010220', 'AGUNG NUGRAHA', 'L', NULL, NULL, 0),
('133010221', 'ENOK SOFIANDI BAHARI DALOK SAR', 'L', NULL, NULL, 0),
('133010222', 'GHINA AFIFAH', 'P', NULL, NULL, 0),
('133010223', 'WILDAN FIRMANSYAH', 'L', NULL, NULL, 0),
('133010224', 'WIRA AKHSANAL', 'L', NULL, NULL, 0),
('133020002', 'BELLA NURHALIZA', 'P', NULL, NULL, 0),
('133020003', 'ADINDA PUTRI DWI NINGRUM', 'P', NULL, NULL, 0),
('133020004', 'SHABIRAH FITRIANI FEBRIANTY', 'P', NULL, NULL, 0),
('133020005', 'ADELLA NUR NOVIANTY', 'P', NULL, NULL, 0),
('133020006', 'SINTA WINDRIANI DEWI', 'P', NULL, NULL, 0),
('133020007', 'SHANNI HAADII NUR SHALEH', 'L', NULL, NULL, 0),
('133020008', 'MESTIKA UTAMI WULANDARI', 'P', NULL, NULL, 0),
('133020009', 'MELISA PUTRI', 'P', NULL, NULL, 0),
('133020010', 'RIRI RISTIFARI', 'P', NULL, NULL, 0),
('133020011', 'FHANZY SAEPUL RACHMAT', 'L', NULL, NULL, 0),
('133020012', 'FITRIA RAHAYU', 'P', NULL, NULL, 0),
('133020013', 'RAGA PADILA MULYANA', 'L', NULL, NULL, 0),
('133020014', 'ITA PUSPITASARI', 'P', NULL, NULL, 0),
('133020015', 'DEDE IRFAN', 'L', NULL, NULL, 0),
('133020016', 'RIMA NUARY RAHMA', 'P', NULL, NULL, 0),
('133020017', 'M. RIZKI SUBAGJA', 'L', NULL, NULL, 0),
('133020018', 'MUHAMAD BAHRUL ULUM', 'L', NULL, NULL, 0),
('133020019', 'R. AFINA NUR FATIMAH', 'P', NULL, NULL, 0),
('133020020', 'R. RONI ADHI WICAKSONO', 'L', NULL, NULL, 0),
('133020021', 'WINDA ARIYANI RAHAYU', 'P', NULL, NULL, 0),
('133020022', 'ERFIN APRILIAN SYACH', 'L', NULL, NULL, 0),
('133020023', 'INDAH SULASTRI SUMARNO', 'P', NULL, NULL, 0),
('133020024', 'ADITYA EKA NUGRAHA', 'L', NULL, NULL, 0),
('133020025', 'PUTRI FITRIYANTI', 'P', NULL, NULL, 0),
('133020026', 'KRISDIAN SOBANDA', 'L', NULL, NULL, 0),
('133020027', 'CINDY SONIA YURISTINA', 'P', NULL, NULL, 0),
('133020028', 'REDYKE EGANANDA', 'P', NULL, NULL, 0),
('133020029', 'DEVI INDRIYANI', 'P', NULL, NULL, 0),
('133020030', 'RIZKY WIRANI', 'P', NULL, NULL, 0),
('133020031', 'ASRI WULANDARI', 'P', NULL, NULL, 0),
('133020032', 'ISHARDI NUR FATHURACHMAN', 'L', NULL, NULL, 0),
('133020033', 'DESY TRESNAPUTRI', 'P', NULL, NULL, 0),
('133020034', 'MUHAMMAD ABDUSYAKIR', 'L', NULL, NULL, 0),
('133020035', 'HANA HANDAYANI ZHAFIRAH', 'P', NULL, NULL, 0),
('133020036', 'NURSYIFA AMALIA', 'P', NULL, NULL, 0),
('133020037', 'HENDRUE NURFALAH', 'L', NULL, NULL, 0),
('133020038', 'SAEPUL NURMUHTADIN', 'L', NULL, NULL, 0),
('133020039', 'IRMA ROSMAYANTI', 'P', NULL, NULL, 0),
('133020040', 'ZAHRA SHAFIYAH MARDIANA', 'P', NULL, NULL, 0),
('133020041', 'FAUZAN PRATAMA ADITYA', 'L', NULL, NULL, 0),
('133020042', 'RAMADIANSYAH', 'L', NULL, NULL, 0),
('143040200', 'Randi', 'L', '08627292020', NULL, 0),
('143040201', 'Rasen', 'L', '08627292020', NULL, 0),
('143040202', 'Bambang', 'L', '08627292020', NULL, 0),
('143040203', 'Basen', 'L', '08627292020', NULL, 0),
('143040204', 'Raden', 'L', '08627292020', NULL, 0),
('143040205', 'Lamas', 'L', '08627292020', NULL, 0),
('143040206', 'Bari', 'L', '08627292020', NULL, 0),
('143040207', 'Naim', 'L', '08627292020', NULL, 0),
('143040208', 'Jasen', 'L', '08627292020', NULL, 0),
('143040209', 'Jamil', 'L', '08627292020', NULL, 0),
('143040210', 'Rivel', 'L', '08627292020', NULL, 0),
('143040220', 'Budi', 'L', '08627292020', NULL, 0),
('143040226', 'Busi', 'L', '08627292020', NULL, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
