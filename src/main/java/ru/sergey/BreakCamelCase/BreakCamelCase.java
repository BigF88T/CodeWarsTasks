package ru.sergey.BreakCamelCase;

/*
Заполните решение так, чтобы функция разбила корпус верблюда, используя пространство между словами.
Пример

"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 */
public class BreakCamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

//    private List<Predicate> buildPredicates(
//            CriteriaQuery<Employee> cq,
//            CriteriaBuilder cb,
//            Root<Employee> employee,
//            Join<Employee, EmployeeProject> employeeProject,
//            Join<Employee, CenterCompetenceManager> manager,
//            Join<Employee, Role> role,
//            Long employeeId, Long projectId, String fullName, String roleName,
//            String position, Integer gradeFrom, Integer gradeTo, Integer currentLoadFrom,
//            Integer currentLoadTo, LocalDate workingDateStartFrom, LocalDate workingDateStartTo,
//            LocalDate workingDateEndFrom, LocalDate workingDateEndTo, LocalDate endDateFrom,
//            LocalDate endDateTo, Long managerId, LocalDate freeDateFrom, LocalDate freeDateTo) {
//
//        List<Predicate> predicates = new ArrayList<>();
//
//        if (employeeId != null) {
//            predicates.add(cb.equal(employee.get("id"), employeeId));
//        }
//
//        if (projectId != null) {
//            predicates.add(cb.equal(employeeProject.get("project").get("id"), projectId));
//        }
//
//        if (fullName != null && !fullName.isEmpty()) {
//            predicates.add(cb.like(employee.get("fullName"), "%" + fullName + "%"));
//        }
//
//        if (roleName != null && !roleName.isEmpty()) {
//            predicates.add(cb.equal(role.get("name"), roleName));
//        }
//
//        if (position != null && !position.isEmpty()) {
//            predicates.add(cb.equal(employee.get("position"), position));
//        }
//
//        if (gradeFrom != null) {
//            predicates.add(cb.ge(employee.get("grade"), gradeFrom));
//        }
//        if (gradeTo != null) {
//            predicates.add(cb.le(employee.get("grade"), gradeTo));
//        }
//
//        if (currentLoadFrom != null) {
//            predicates.add(cb.ge(employeeProject.get("load"), currentLoadFrom));
//        }
//        if (currentLoadTo != null) {
//            predicates.add(cb.le(employeeProject.get("load"), currentLoadTo));
//        }
//
//        if (workingDateStartFrom != null) {
//            predicates.add(cb.greaterThanOrEqualTo(employeeProject.get("workingDateStart"), workingDateStartFrom));
//        }
//        if (workingDateStartTo != null) {
//            predicates.add(cb.lessThanOrEqualTo(employeeProject.get("workingDateStart"), workingDateStartTo));
//        }
//
//        if (workingDateEndFrom != null) {
//            predicates.add(cb.greaterThanOrEqualTo(employeeProject.get("workingDateEnd"), workingDateEndFrom));
//        }
//        if (workingDateEndTo != null) {
//            predicates.add(cb.lessThanOrEqualTo(employeeProject.get("workingDateEnd"), workingDateEndTo));
//        }
//
//        if (endDateFrom != null) {
//            predicates.add(cb.greaterThanOrEqualTo(employeeProject.get("project").get("projectEndDate"), endDateFrom));
//        }
//        if (endDateTo != null) {
//            predicates.add(cb.lessThanOrEqualTo(employeeProject.get("project").get("projectEndDate"), endDateTo));
//        }
//
//        if (managerId != null) {
//            predicates.add(cb.equal(manager.get("id"), managerId));
//        }
//
//        if (freeDateFrom != null || freeDateTo != null) {
//            Subquery<Long> subQuery = cq.subquery(Long.class);
//            Root<EmployeeProject> subEmployeeProject = subQuery.from(EmployeeProject.class);
//            subQuery.select(subEmployeeProject.get("employee").get("id"));
//
//            List<Predicate> subPredicates = new ArrayList<>();
//
//            if (freeDateFrom != null && freeDateTo != null) {
//                subPredicates.add(cb.and(
//                        cb.lessThanOrEqualTo(subEmployeeProject.get("workingDateStart"), freeDateTo),
//                        cb.greaterThanOrEqualTo(subEmployeeProject.get("workingDateEnd"), freeDateFrom)
//                ));
//            } else if (freeDateFrom != null) {
//                subPredicates.add(cb.and(
//                        cb.lessThanOrEqualTo(subEmployeeProject.get("workingDateStart"), freeDateFrom),
//                        cb.greaterThanOrEqualTo(subEmployeeProject.get("workingDateEnd"), freeDateFrom)
//                ));
//            } else {
//                subPredicates.add(cb.and(
//                        cb.lessThanOrEqualTo(subEmployeeProject.get("workingDateStart"), freeDateTo),
//                        cb.greaterThanOrEqualTo(subEmployeeProject.get("workingDateEnd"), freeDateTo)
//                ));
//            }
//            subQuery.where(subPredicates.toArray(new Predicate[0]));
//
//            predicates.add(cb.not(employee.get("id").in(subQuery)));
//        }
//    }
}