-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 20, 2023 lúc 05:28 PM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `techmaster`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `admins`
--

CREATE TABLE `admins` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `admins`
--

INSERT INTO `admins` (`id`, `user_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 3, 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 6, 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 9, 2, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `attendances`
--

CREATE TABLE `attendances` (
  `id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `lecture_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `attendances`
--

INSERT INTO `attendances` (`id`, `class_id`, `student_id`, `lecture_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(11, 1, 1, 1, 15, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(12, 1, 2, 1, 15, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(13, 1, 3, 1, 15, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(14, 2, 4, 2, 15, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(15, 2, 5, 2, 15, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(16, 3, 6, 3, 15, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(17, 3, 7, 3, 16, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(18, 4, 2, 4, 16, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(19, 4, 1, 4, 16, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL),
(20, 5, 1, 5, 15, '2023-06-20 15:25:10', '2023-06-20 15:25:10', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `classes`
--

CREATE TABLE `classes` (
  `id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `classes`
--

INSERT INTO `classes` (`id`, `course_id`, `teacher_id`, `name`, `start_date`, `end_date`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 1, 1, 'Programming Fundamentals', '2023-09-01', '2023-12-15', 8, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 1, 2, 'Database Design Principles', '2023-09-01', '2023-12-15', 8, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 1, 3, 'Web Development Fundamentals', '2023-09-01', '2023-12-15', 8, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 2, 4, 'Advanced Data Structures', '2023-09-01', '2023-12-15', 9, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 2, 2, 'Operating Systems and Kernel Design', '2023-09-01', '2023-12-15', 9, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `class_students`
--

CREATE TABLE `class_students` (
  `id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `class_students`
--

INSERT INTO `class_students` (`id`, `class_id`, `student_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 1, 1, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 1, 2, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 1, 3, 11, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 2, 4, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 2, 1, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(6, 3, 2, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(7, 3, 1, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(8, 4, 3, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(9, 4, 4, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(10, 5, 5, 10, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `courses`
--

CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `courses`
--

INSERT INTO `courses` (`id`, `name`, `description`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Introduction to Programming', 'An introductory course on programming concepts and logic', 4, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 'Database Design', 'A course on designing and implementing relational databases', 4, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 'Web Development', 'A course on building dynamic web applications using modern web technologies', 4, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 'Data Structures and Algorithms', 'A course on advanced data structures and algorithm design', 4, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 'Operating Systems', 'A course on the design and implementation of operating systems', 5, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `courses_teachers`
--

CREATE TABLE `courses_teachers` (
  `id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `courses_teachers`
--

INSERT INTO `courses_teachers` (`id`, `course_id`, `teacher_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 1, 1, 6, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 2, 2, 6, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 3, 3, 6, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 4, 4, 7, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 4, 5, 6, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `grades`
--

CREATE TABLE `grades` (
  `id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `lecture_id` int(11) NOT NULL,
  `grade` float NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `grades`
--

INSERT INTO `grades` (`id`, `class_id`, `student_id`, `lecture_id`, `grade`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 1, 1, 1, 85, 17, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(2, 1, 2, 1, 92.5, 17, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(3, 1, 3, 1, 78, 18, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(4, 2, 4, 2, 88.5, 18, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(5, 2, 5, 2, 91, 17, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(6, 3, 6, 3, 79.5, 17, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(7, 3, 7, 3, 84, 17, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(8, 4, 2, 4, 90, 17, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(9, 4, 1, 4, 86.5, 17, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL),
(10, 5, 1, 5, 93, 17, '2023-06-20 15:27:03', '2023-06-20 15:27:03', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lectures`
--

CREATE TABLE `lectures` (
  `id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `content` text NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `lectures`
--

INSERT INTO `lectures` (`id`, `class_id`, `title`, `content`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 1, 'Introduction to Programming', 'Introduction to programming concepts and logic', 13, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 1, 'Variables and Data Types', 'Understanding variables and data types in programming', 13, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 2, 'Relational Database Design', 'Designing and implementing a relational database', 13, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 2, 'Normalization and Database Integrity', 'Understanding normalization and maintaining database integrity', 13, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 3, 'HTML and CSS Fundamentals', 'Introduction to HTML and CSS for web development', 13, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(6, 3, 'JavaScript and jQuery', 'Introduction to JavaScript and jQuery for web development', 13, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(7, 4, 'Trees and Graphs', 'Understanding advanced data structures like trees and graphs', 14, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(8, 4, 'Sorting and Searching Algorithms', 'Understanding advanced sorting and searching algorithms', 14, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(9, 5, 'Kernel Design Principles', 'Introduction to kernel design principles', 13, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(10, 5, 'Process Scheduling and Memory Management', 'Understanding process scheduling and memory management in operating systems', 13, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `status`
--

CREATE TABLE `status` (
  `id` int(11) NOT NULL,
  `keyy` varchar(20) NOT NULL,
  `valuee` varchar(50) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `status`
--

INSERT INTO `status` (`id`, `keyy`, `valuee`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'user', 'Hoạt động', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 'user', 'Đang ẩn', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 'user', 'Đã xóa', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 'courses', 'Đang mở', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 'courses', 'Đã kết thúc', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(6, 'courses_teachers', 'Đang dạy', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(7, 'courses_teachers', 'Đã kết thúc giảng dạy', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(8, 'classes', 'Đang mở', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(9, 'classes', 'Đã kết thúc', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(10, 'class_students', 'Đang học', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(11, 'class_students', 'Đã nghỉ học', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(12, 'class_students', 'Bảo lưu', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(13, 'lectures', 'Đang mở', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(14, 'lectures', 'Đang đóng', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(15, 'attendances', 'Đi học', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(16, 'attendances', 'Nghỉ học', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(17, 'grades', 'Đã chấm', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(18, 'grades', 'chưa chấm', '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `students`
--

INSERT INTO `students` (`id`, `user_id`, `full_name`, `phone_number`, `address`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 10, 'Phạm Thị D', '0987654324', 'TP. HCM', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 11, 'Hoàng Văn E', '0987654325', 'Hà Nội', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 12, 'Trần Thị F', '0987654326', 'Hải Phòng', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 13, 'Phạm Thị D', '0987654324', 'TP. HCM', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 4, 'Hoàng Văn E', '0987654325', 'Hà Nội', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(6, 7, 'Trần Thị F', '0987654326', 'Hải Phòng', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(7, 1, 'Phạm Thị D', '0987654324', 'TP. HCM', 2, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `teachers`
--

CREATE TABLE `teachers` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `teachers`
--

INSERT INTO `teachers` (`id`, `user_id`, `full_name`, `phone_number`, `address`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 14, 'Nguyễn Văn A', '0987654321', 'Hà Nội', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 15, 'Trần Thị B', '0987654322', 'Hải Phòng', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 16, 'Lê Văn C', '0987654323', 'Đà Nẵng', 2, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 8, 'Nguyễn Văn A', '0987654321', 'Hà Nội', 2, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 5, 'Trần Thị B', '0987654322', 'Hải Phòng', 3, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(6, 2, 'Lê Văn C', '0987654323', 'Đà Nẵng', 3, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `email`, `role`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'user01', 'password01', 'user01@example.com', 'student', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(2, 'user02', 'password02', 'user02@example.com', 'teacher', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(3, 'user03', 'password03', 'user03@example.com', 'admin', 3, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(4, 'user04', 'password04', 'user04@example.com', 'student', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(5, 'user05', 'password05', 'user05@example.com', 'teacher', 2, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(6, 'user06', 'password06', 'user06@example.com', 'admin', 2, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(7, 'user07', 'password07', 'user07@example.com', 'student', 3, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(8, 'user08', 'password08', 'user08@example.com', 'teacher', 3, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(9, 'user09', 'password09', 'user09@example.com', 'admin', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(10, 'user10', 'password10', 'user10@example.com', 'student', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(11, 'user11', 'password11', 'user11@example.com', 'student', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(12, 'user12', 'password12', 'user12@example.com', 'student', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(13, 'user13', 'password13', 'user13@example.com', 'student', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(14, 'user14', 'password14', 'user14@example.com', 'teacher', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(15, 'user15', 'password15', 'user15@example.com', 'teacher', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL),
(16, 'user16', '6password16', 'user16@example.com', 'teacher', 1, '2023-06-20 15:22:53', '2023-06-20 15:22:53', NULL);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_admins_users` (`user_id`),
  ADD KEY `fk_admins_status` (`status_id`);

--
-- Chỉ mục cho bảng `attendances`
--
ALTER TABLE `attendances`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_attendances_classes` (`class_id`),
  ADD KEY `fk_attendances_students` (`student_id`),
  ADD KEY `fk_attendances_lectures` (`lecture_id`),
  ADD KEY `fk_attendances_status` (`status_id`);

--
-- Chỉ mục cho bảng `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_classes_course` (`course_id`),
  ADD KEY `fk_classes_teachers` (`teacher_id`),
  ADD KEY `fk_classes_status` (`status_id`);

--
-- Chỉ mục cho bảng `class_students`
--
ALTER TABLE `class_students`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_class_students_classes` (`class_id`),
  ADD KEY `fk_class_students_students` (`student_id`),
  ADD KEY `fk_class_students_status` (`status_id`);

--
-- Chỉ mục cho bảng `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_courses_status` (`status_id`);

--
-- Chỉ mục cho bảng `courses_teachers`
--
ALTER TABLE `courses_teachers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_courses_teachers_courses` (`course_id`),
  ADD KEY `fk_courses_teachers_teachers` (`teacher_id`),
  ADD KEY `fk_courses_teachers_status` (`status_id`);

--
-- Chỉ mục cho bảng `grades`
--
ALTER TABLE `grades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_grades_classes` (`class_id`),
  ADD KEY `fk_grades_students` (`student_id`),
  ADD KEY `fk_grades_lectures` (`lecture_id`),
  ADD KEY `fk_grades_status` (`status_id`);

--
-- Chỉ mục cho bảng `lectures`
--
ALTER TABLE `lectures`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_lectures_classes` (`class_id`),
  ADD KEY `fk_lectures_status` (`status_id`);

--
-- Chỉ mục cho bảng `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_students_users` (`user_id`),
  ADD KEY `fk_students_status` (`status_id`);

--
-- Chỉ mục cho bảng `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_teachers_users` (`user_id`),
  ADD KEY `fk_teachers_status` (`status_id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_users_status` (`status_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `admins`
--
ALTER TABLE `admins`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `attendances`
--
ALTER TABLE `attendances`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT cho bảng `classes`
--
ALTER TABLE `classes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `class_students`
--
ALTER TABLE `class_students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `courses_teachers`
--
ALTER TABLE `courses_teachers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `grades`
--
ALTER TABLE `grades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `lectures`
--
ALTER TABLE `lectures`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `status`
--
ALTER TABLE `status`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT cho bảng `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `teachers`
--
ALTER TABLE `teachers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `admins`
--
ALTER TABLE `admins`
  ADD CONSTRAINT `fk_admins_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_admins_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `attendances`
--
ALTER TABLE `attendances`
  ADD CONSTRAINT `fk_attendances_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_attendances_lectures` FOREIGN KEY (`lecture_id`) REFERENCES `lectures` (`id`),
  ADD CONSTRAINT `fk_attendances_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_attendances_students` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`);

--
-- Các ràng buộc cho bảng `classes`
--
ALTER TABLE `classes`
  ADD CONSTRAINT `fk_classes_course` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`),
  ADD CONSTRAINT `fk_classes_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_classes_teachers` FOREIGN KEY (`teacher_id`) REFERENCES `teachers` (`id`);

--
-- Các ràng buộc cho bảng `class_students`
--
ALTER TABLE `class_students`
  ADD CONSTRAINT `fk_class_students_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_class_students_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_class_students_students` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`);

--
-- Các ràng buộc cho bảng `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `fk_courses_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);

--
-- Các ràng buộc cho bảng `courses_teachers`
--
ALTER TABLE `courses_teachers`
  ADD CONSTRAINT `fk_courses_teachers_courses` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`),
  ADD CONSTRAINT `fk_courses_teachers_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_courses_teachers_teachers` FOREIGN KEY (`teacher_id`) REFERENCES `teachers` (`id`);

--
-- Các ràng buộc cho bảng `grades`
--
ALTER TABLE `grades`
  ADD CONSTRAINT `fk_grades_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_grades_lectures` FOREIGN KEY (`lecture_id`) REFERENCES `lectures` (`id`),
  ADD CONSTRAINT `fk_grades_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_grades_students` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`);

--
-- Các ràng buộc cho bảng `lectures`
--
ALTER TABLE `lectures`
  ADD CONSTRAINT `fk_lectures_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_lectures_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);

--
-- Các ràng buộc cho bảng `students`
--
ALTER TABLE `students`
  ADD CONSTRAINT `fk_students_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_students_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `teachers`
--
ALTER TABLE `teachers`
  ADD CONSTRAINT `fk_teachers_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_teachers_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_users_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
