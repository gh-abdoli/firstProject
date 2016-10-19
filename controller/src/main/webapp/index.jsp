<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>پروژه اول</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
</head>
<body>
<!-----------------Start Header------------------>
    <div class="container-fluid header">
        <div class="container">
            <div class="row ">
                <div class="col-md-6">
                    <div class="login">
                        <button type="button" class="btn btn-success btn-lg"> ورود کاربران
                            <span class="glyphicon glyphicon-user"/>
                        </button>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="header-title">
                        <h1>به سایت شرکت میهن داده خوش امدید</h1>
                        <h4>اولین برنامه تمرینی</h4>
                    </div>
                </div>
            </div>
        </div>
    </div>
<!------------------End Header------------------------->
<!------------------------Start Content---------------->
    <div class="container content mrg-top">
        <div class="row">
            <div class="col-md-12">
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active">
                        <a href="#home" aria-controls="home" role="tab" data-toggle="tab">ورود مشخصات</a>
                    </li>
                    <li role="presentation">
                        <a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">نمایش اطلاعات </a>
                    </li>
                </ul>

                <div class="tab-content mrg-top">
                    <div role="tabpanel" class="tab-pane fade in active" id="home">
                        <form class="mrg-botton" action="/registerPerson.do">
                            <div class="form-group ">
                                <div class="input-group mrg-top">
                                    <input type="text" name="id" class="form-control" placeholder="شماره کارمندی" aria-describedby="sizing-addon2">
                                    <span class="input-group-addon" id="sizing-addon1">شماره کارمندی</span>
                                </div>
                                <div class="input-group mrg-top">
                                    <input type="text" name="name" class="form-control" placeholder="نام را وارد کنید" aria-describedby="sizing-addon2">
                                    <span class="input-group-addon" id="sizing-addon2">نام</span>
                                </div>
                                <div class="input-group mrg-top">
                                    <input type="text" name="family" class="form-control" placeholder="نام خانوادگی را وارد کنید" aria-describedby="sizing-addon2">
                                    <span class="input-group-addon" id="sizing-addon3">نام خانوادگی</span>
                                </div>

                                <div class="input-group mrg-top">
                                    <input type="text" name="dateOfBird" id="datepicker" class="form-control" placeholder="تاریخ تولد" aria-describedby="sizing-addon2">
                                    <span class="input-group-addon" id="sizing-addon4">تاریخ تولد</span>
                                </div>

                                <div class="input-group mrg-top">
                                    <input type="text" name="experienceYear" class="form-control" placeholder="میزان سابقه کاری" aria-describedby="sizing-addon2">
                                    <span class="input-group-addon" id="sizing-addon5">سابقه</span>
                                </div>

                                <div class="input-group mrg-top">
                                    <input type="text" name="wage" class="form-control" placeholder="حقوق پایه" aria-describedby="sizing-addon2">
                                    <span class="input-group-addon" id="sizing-addon6">حقوق</span>
                                </div>

                                <div class="input-group mrg-top">
                                    <input type="text" name="year" class="form-control" placeholder="میزان افزایش حقوق در طول جند سال" aria-describedby="sizing-addon2">
                                    <span class="input-group-addon" id="sizing-addon7">سال</span>
                                </div>

                                <div class="input-group mrg-top mrg-botton">
                                        <div class="input-group ">
                                            <input type="text" id="datebox" name="position" placeholder="سمت سازمانی" class="form-control" aria-describedby="sizing-addon2"/>
                                            <div class="input-group-btn">
                                                <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                                                    <span class="caret"></span>   سمت
                                                </button>
                                                <ul id="demolist" class="dropdown-menu">
                                                    <li><a href="#">ریس</a></li>
                                                    <li><a href="#">کارمند</a></li>
                                                    <li><a href="#">مدیر بخش</a></li>
                                                    <li><a href="#">لیدر تیم</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-success">دخیره</button>
                        </form>
                    </div>
                    <div role="tabpanel" class="tab-pane fade" id="profile">
                        <div class="panel panel-default">
                            <!-- Default panel contents -->
                            <div class="panel-heading">لیست افراد</div>

                            <!-- Table -->
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>شماره کارمندی</th>
                                        <th>سمت </th>
                                        <th>نام </th>
                                        <th>نام خانوادگی</th>
                                        <th>تاریخ تولد</th>
                                        <th>سابقه</th>
                                        <th>حقوق</th>
                                        <th>افزایش حقوق </th>
                                        <th>حذف</th>
                                    </tr>
                                </thead>
                                <tbody class="myTable">
                                </tbody>
                            </table>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<!------------------------End Content----------------->
<!------------------------Start Footer---------------->
    <div class="container-fluid footer">
        <div class="container mrg-top">
            <div class="row">
                <div class="col-md-4">
                    <img src="images/facebook.png" alt="gh.abdoli">
                </div>
                <div class="col-md-4">
                    <img src="images/linkedin.png" alt="@ghasemAbdoli">
                </div>
                <div class="col-md-4">
                    <img src="images/skype.png" alt="@ghasemAbdoli">
                </div>
                <div class="row">
                    <h6 class="mrg-top ">قدرت گرفته از بوت استرپ</h6>
                </div>
            </div>
        </div>
    </div>
<!----------------------------End Footer---------------->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="js/customJQuery.js"></script>
</body>
</html>